package io.course.android;

import io.course.android.shapes.Circle;
import io.course.android.shapes.IShape;
import io.course.android.shapes.Rectangle;
import io.course.android.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[]{
                new Rectangle(10, 20),
                new Triangle(5, 2, 6),
                new Circle(14)
        };
        double sumArea = getSumArea(shapes);
        System.out.println("Сумма площадей фигур: " + sumArea);
    }

    private static double getSumArea(IShape[] shapes) {
        double sum = 0;
        for (IShape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}