package com.code.example.creationalPatterns.singletonPattern;

public class Singleton {

    private Singleton() {

    }

    private static Singleton instance1;

    /**
     * 懒汉式，线程不安全
     * @return
     */
    public static Singleton getInstance1() {
        if(instance1 == null) {
            instance1 = new Singleton();
        }
        return instance1;
    }

    /**
     * 懒汉式，线程安全
     * @return
     */
    public static synchronized Singleton getInstance2() {
        if (instance1 == null) {
            instance1 = new Singleton();
        }
        return instance1;
    }

    private static Singleton instance3 = new Singleton();

    /**
     * 饿汉式
     * @return
     */
    public static Singleton getInstance3() {
        return instance3;
    }

    private volatile static Singleton singleton4;

    /**
     * 双检锁/双重校验锁（DCL，即 double-checked locking）
     * @return
     */
    public static Singleton getInstance4() {
        if (singleton4 == null) {
            synchronized (Singleton.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton();
                }
            }
        }
        return singleton4;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 登记式/静态内部类
     * @return
     */
    public static final Singleton getInstance5() {
        return SingletonHolder.INSTANCE;
    }

}
