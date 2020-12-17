package com.code.example.creationalPatterns.factoryPattern.impl;

import com.code.example.creationalPatterns.factoryPattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
