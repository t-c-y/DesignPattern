package com.code.course.flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * @author tongchengyu
 */
public class FlyweightPatternTest {

    public static class Flyweight {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Flyweight(String name) {
            super();
            this.name = name;
        }

        public void execute() {
            System.out.println(name + "执行功能逻辑");
        }

    }

    public static class FlyweightFactory {
        public static Map<String, Flyweight> cache = new HashMap<>();
        public static  Flyweight get(String name) {
            Flyweight flyweight = cache.get(name);
            if (flyweight == null) {
                flyweight = new Flyweight(name);
                cache.put(name, flyweight);
            }
            return flyweight;
        }
    }

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.get("obj");
        flyweight1.execute();
        Flyweight flyweight2 = FlyweightFactory.get("obj");
        flyweight2.execute();
        System.out.println(flyweight1 == flyweight2);
    }

}
