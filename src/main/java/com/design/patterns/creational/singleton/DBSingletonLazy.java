package com.design.patterns.creational.singleton;

public class DBSingletonLazy {

    private static DBSingletonLazy instance;

    private DBSingletonLazy() {}

    public static DBSingletonLazy getInstance() {
        if(instance == null) {
            instance = new DBSingletonLazy();
        }
        return instance;
    }

}
