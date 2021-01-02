package com.code.example.creationalPatterns.abstractFactoryPattern.pojo;

import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Shape;

public class Rectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}