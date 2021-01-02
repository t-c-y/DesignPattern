package com.code.example.creationalPatterns.abstractFactoryPattern.service;

import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Color;
import com.code.example.creationalPatterns.abstractFactoryPattern.inf.Shape;
import com.code.example.creationalPatterns.abstractFactoryPattern.pojo.Blue;
import com.code.example.creationalPatterns.abstractFactoryPattern.pojo.Green;
import com.code.example.creationalPatterns.abstractFactoryPattern.pojo.Red;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}
