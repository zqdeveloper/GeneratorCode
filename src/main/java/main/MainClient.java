package main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import constant.Path;
import controller.entry.Entry;
import controller.entry.M;
import controller.entry.Property;
import generator.Generator;
import utils.FieldUtil;
import utils.TypeUtil;

public class MainClient {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://20.21.1.102:3306/iot_broker_base_screen?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String user = "root";
    private static final String pwd = "zjrc2019";

    private Map<String, Entry> table = new HashMap<String, Entry>();

    public static void main(String[] args) {
        MainClient mainClient = new MainClient();
        try {
            mainClient.start();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void start() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, pwd);
        Statement statement = conn.createStatement();
        DatabaseMetaData dbmd = conn.getMetaData();
        String catalog = conn.getCatalog();
        ResultSet resultSet = dbmd.getTables(catalog, "%", "%", new String[]{"TABLE"});
        //获取所有的表
        table.clear();
        while (resultSet.next()) {
            String tableName = resultSet.getString("TABLE_NAME");
            String remarkes = resultSet.getString("REMARKS");
            String className = FieldUtil.getClassName(tableName);
            Entry entry = new Entry(Path.ENTRYPATH, className, tableName, remarkes);
            ResultSet primaryKeyResultSet = dbmd.getPrimaryKeys(catalog, null, entry.getTableName());
            while (primaryKeyResultSet.next()) {
                String primaryKeyColumnName = primaryKeyResultSet.getString("COLUMN_NAME");
                entry.addPrimaryKey(primaryKeyColumnName);
            }

            table.put(tableName, entry);
        }
        //获取所有的表下面的所有的类
        for (Map.Entry<String, Entry> map : table.entrySet()) {
            Entry entry = map.getValue();


            ResultSet rs = dbmd.getColumns(catalog, null, entry.getTableName(), "%");

            while (rs.next()) {

                Property property = new Property();

                String cloumnName = rs.getString("COLUMN_NAME");
                String REMARKS = rs.getString("REMARKS");
                String TYPE_NAME = rs.getString("TYPE_NAME");
                String IS_NULLABLE = rs.getString("IS_NULLABLE");

                String propertyName = FieldUtil.getPropertyName(cloumnName);
                property.setCloumnName(cloumnName);
                property.setDbType(TYPE_NAME);
                property.setTypeName(TypeUtil.getClassType(TYPE_NAME));
                property.setComment(REMARKS);
                property.setName(propertyName);
                property.setJdbcType(TypeUtil.getJdbcType(TYPE_NAME));
                boolean yes = IS_NULLABLE.equals("YES");
                property.setRequired(yes);
                entry.put(property);

                M get = new M(M.METHOD.GET, property);
                entry.putM(get);

                M set = new M(M.METHOD.SET, property);
                entry.putM(set);

            }
            rs.close();
        }
        resultSet.close();
        statement.close();
        conn.close();
        Generator.start(table);
        System.out.println(table.size());
    }
}
