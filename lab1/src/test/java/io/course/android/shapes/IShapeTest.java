package io.course.android.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IShapeTest {

    @Test
    void getArea() {
        getRectangleArea();
    }

    @Test
    void getPerimeter() {
        getRectanglePerimeter();
        getTrianglePerimeter();
    }

    @Test
    void getRectangleArea() {
        double width = 10;
        double height = 20;
        double area = width * height;

        IShape rectangle = new Rectangle(width, height);
        Assertions.assertEquals(area, rectangle.getArea());
    }

    @Test
    void getRectanglePerimeter() {
        double width = 10;
        double height = 20;
        double perimeter = (width + height) * 2;

        IShape rectangle = new Rectangle(width, height);
        Assertions.assertEquals(perimeter, rectangle.getPerimeter());
    }

    @Test
    void getTrianglePerimeter() {
        double sideA = 1;
        double sideB = 3;
        double sideC = 4;
        double perimeter = sideA + sideB + sideC;

        IShape triangle = new Triangle(sideA, sideB, sideC);
        Assertions.assertEquals(perimeter, triangle.getPerimeter());
    }
}