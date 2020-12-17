package com.code.example.creationalPatterns.factoryPattern.impl;

import com.code.example.creationalPatterns.factoryPattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
