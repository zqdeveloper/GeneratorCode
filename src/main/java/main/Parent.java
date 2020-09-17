package main;

import java.util.List;

public abstract class Parent<T extends Table> {

    public abstract T getCondition();


    public abstract List<T> updateTarget();
}
