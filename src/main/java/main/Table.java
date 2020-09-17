package main;

public class Table {
    private String name;
    private String column;

    public Table(String name, String clolumn) {
        this.name = name;
        this.column = clolumn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }
}
