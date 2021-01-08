package com.code.example.creationalPatterns.singletonPattern;

public class Main {

    public static void main(String[] args) {
        //1.懒汉式，线程不安全
        System.out.println("1.懒汉式，线程不安全 = [" + Singleton.getInstance1() + "]");
        //2.懒汉式，线程安全
        System.out.println("2.懒汉式，线程安全 = [" + Singleton.getInstance2() + "]");
        //3.饿汉式
        System.out.println("3.饿汉式 = [" + Singleton.getInstance3() + "]");
        //4.双检锁/双重校验锁（DCL，即 double-checked locking）
        System.out.println("4.DCL = [" + Singleton.getInstance4() + "]");
        //5.登记式/静态内部类
        System.out.println("5.登记式/静态内部类 = [" + Singleton.getInstance5() + "]");
    }

}
