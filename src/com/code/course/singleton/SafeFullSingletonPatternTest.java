package com.code.course.singleton;

/**
 * 线程安全的单例模式
 * @author tcy
 */
public class SafeFullSingletonPatternTest {

    public static class Singleton {

        private static Singleton instance;

        private Singleton() {}

        public static Singleton getInstance() {
            if (instance == null) {

                synchronized(SafeFullSingletonPatternTest.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }

            }
            return instance;
        }

    }

}
