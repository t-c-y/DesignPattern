package com.code.example.creationalPatterns.abstractFactoryPattern.service;

import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Color;
import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}