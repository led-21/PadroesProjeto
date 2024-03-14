package com.adr.gof.singleton;

/**
 * Singleton Eager
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
