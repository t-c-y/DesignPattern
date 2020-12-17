package com.code.example.creationalPatterns.factoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw();
        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();
        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();
    }
}
