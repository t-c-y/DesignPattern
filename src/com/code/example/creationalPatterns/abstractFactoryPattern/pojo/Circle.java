package com.code.example.creationalPatterns.abstractFactoryPattern.pojo;

import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Shape;

public class Circle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}