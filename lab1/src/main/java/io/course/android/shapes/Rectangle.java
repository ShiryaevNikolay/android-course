package io.course.android.shapes;

public class Rectangle extends BaseShape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("yellow");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
