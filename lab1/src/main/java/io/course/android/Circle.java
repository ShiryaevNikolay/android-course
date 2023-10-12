package io.course.android;

public class Circle extends BaseShape {

    private final double radius;

    public Circle(double radius) {
        super("green");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
