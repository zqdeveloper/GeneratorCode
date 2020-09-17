package controller.entry;

/**
 * 类的属性
 *
 * @author zhangqing
 */
public class Property {
    //该字段名的注释
    private String comment;
    //名称
    private String name;
    //该属性对应的表字段
    private String cloumnName;
    //对应的java数据类型
    private Class<?> typeName;
    //对应的数据库中数据类型
    private String dbType;
    //对应的jdbyType
    private String jdbcType;
    //是否可为空
    private boolean isRequired = false;

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCloumnName() {
        return cloumnName;
    }

    public void setCloumnName(String cloumnName) {
        this.cloumnName = cloumnName;
    }

    public Class<?> getTypeName() {
        return typeName;
    }

    public void setTypeName(Class<?> typeName) {
        this.typeName = typeName;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }


    @Override
    public String toString() {
        return "Property{" +
                "comment='" + comment + '\'' +
                ", name='" + name + '\'' +
                ", cloumnName='" + cloumnName + '\'' +
                ", typeName=" + typeName +
                ", dbType='" + dbType + '\'' +
                ", jdbcType='" + jdbcType + '\'' +
                ", isRequired=" + isRequired +
                '}';
    }
}
