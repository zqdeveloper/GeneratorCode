package utils;

import java.util.HashMap;
import java.util.Map;

public class TypeUtil {
    private static Map<String, Class<?>> javaTypeMap = new HashMap<String, Class<?>>();
    private static Map<String, String> jdbcTypeMap = new HashMap<String, String>();


    public static Class<?> getClassType(String dbType) {
        Class<?> c = javaTypeMap.get(dbType);
        if (c == null) {
            switch (dbType) {
                case "CHAR":
                case "VARCHAR":
                case "MEDIUMTEXT":
                case "DATETIME":
                case "TIMESTAMP":
                case "TEXT":
                    c = String.class;
                    break;
                case "INT":
                case "BIGINT":
                case "TINYINT":
                case "INT UNSIGNED":
                    c = Integer.class;
                    break;
            }
            javaTypeMap.put(dbType, c);
        }
        System.out.println(dbType);
        return c;
    }

    public static String getJdbcType(String dbType) {
        String type = jdbcTypeMap.get(dbType);
        if (type == null) {
            switch (dbType) {
                case "CHAR":
                case "VARCHAR":
                case "MEDIUMTEXT":
                case "DATETIME":
                case "TIMESTAMP":
                    type = "VARCHAR";
                    break;
                case "INT":
                case "BIGINT":
                case "TINYINT":
                case "INT UNSIGNED":
                    type = "INTEGER";
                    break;
            }
            jdbcTypeMap.put(dbType, type);
        }
        return type;
    }
}
