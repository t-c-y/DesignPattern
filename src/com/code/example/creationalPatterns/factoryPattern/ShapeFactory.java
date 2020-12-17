package com.code.example.creationalPatterns.factoryPattern;

import com.code.example.creationalPatterns.factoryPattern.impl.Circle;
import com.code.example.creationalPatterns.factoryPattern.impl.Rectangle;
import com.code.example.creationalPatterns.factoryPattern.impl.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
