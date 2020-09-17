package controller.entry;

import utils.FieldUtil;

public class M {
    private String name;
    private String dbType;
    private Property property;
    private String param;
    private Class<?> c;
    private METHOD m;

    public M(METHOD m, Property property) {
        this.m = m;
        this.property = property;
        this.param = property.getName();
        this.c = property.getTypeName();
        switch (m) {
            case GET:
                this.name = "get" + FieldUtil.getMethodName(property.getCloumnName());
                break;
            case SET:
                this.name = "set" + FieldUtil.getMethodName(property.getCloumnName());
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Class<?> getC() {
        return c;
    }

    public void setC(Class<?> c) {
        this.c = c;
    }


    public METHOD getM() {
        return m;
    }

    public void setM(METHOD m) {
        this.m = m;
    }


    public static enum METHOD {
        GET("GET"), SET("SET");

        private String method;

        METHOD(String m) {
            this.method = m;
        }

        public String value() {
            return method;
        }

    }
}
