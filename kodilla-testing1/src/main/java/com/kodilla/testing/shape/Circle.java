package com.kodilla.testing.shape;

public class Circle implements Shape{
    @Override
    public String getShapeName() {
        return "Cirlce";
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius, 2);
    }
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}
