package controller.entry;

import java.util.ArrayList;
import java.util.List;

public class Entry {
    //类名称
    private String className;
    //包名
    private String packageName;
    //表名称
    private String tableName;
    //注释信息
    private String comment;
    //所有的字段
    private List<Property> properties = new ArrayList<Property>();
    //所有的方法
    private List<M> ms = new ArrayList<M>();
    private String primaryKey;

    public void putM(M m) {
        if (ms.contains(m)) return;
        ms.add(m);
    }

    public Entry(String packageName, String className, String tableName, String comment) {
        this.className = className;
        this.packageName = packageName;
        this.tableName = tableName;
        this.comment = comment;
    }


    public String getClassName() {
        return className;
    }


    public void setClassName(String className) {
        this.className = className;
    }


    public String getPackageName() {
        return packageName;
    }


    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }


    public String getTableName() {
        return tableName;
    }


    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }


    public List<Property> getProperties() {
        return properties;
    }


    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public void put(Property property) {
        if (properties.contains(property)) return;
        properties.add(property);
    }

    public List<M> getMs() {
        return ms;
    }

    public void setMs(List<M> ms) {
        this.ms = ms;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void addPrimaryKey(String primaryKeyColumnName) {
        setPrimaryKey(primaryKeyColumnName);
    }
}
