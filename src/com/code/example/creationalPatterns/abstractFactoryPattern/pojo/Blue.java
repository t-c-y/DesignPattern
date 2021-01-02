package com.code.example.creationalPatterns.abstractFactoryPattern.pojo;

import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Color;

public class Blue implements Color {
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}