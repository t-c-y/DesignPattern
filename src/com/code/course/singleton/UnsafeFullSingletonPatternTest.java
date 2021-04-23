package com.code.course.singleton;

/**
 * 单例设计模式：线程不安全的饱汉模式
 * @author tcy
 */
public class UnsafeFullSingletonPatternTest {

    /**
     * 线程不安全
     */
    public static class Singleton {
        private static Singleton instance;

        private Singleton() {}

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

}
