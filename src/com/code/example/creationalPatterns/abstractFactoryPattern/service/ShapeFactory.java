package com.code.example.creationalPatterns.abstractFactoryPattern.service;

import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Color;
import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Shape;
import com.code.example.creationalPatterns.abstractFactoryPattern.pojo.Circle;
import com.code.example.creationalPatterns.abstractFactoryPattern.pojo.Rectangle;
import com.code.example.creationalPatterns.abstractFactoryPattern.pojo.Square;

public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}