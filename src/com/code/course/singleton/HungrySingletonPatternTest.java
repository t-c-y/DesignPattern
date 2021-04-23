package com.code.course.singleton;

/**
 * 饿汉模式
 * @author tcy
 */
public class HungrySingletonPatternTest {

    public static class Singleton {
        private static final Singleton instance = new Singleton();

        private Singleton() {}

        public static Singleton getInstance() {
            return instance;
        }
    }

}
