package com.code.example.creationalPatterns.abstractFactoryPattern.pojo;

import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Color;

public class Green implements Color {
   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}