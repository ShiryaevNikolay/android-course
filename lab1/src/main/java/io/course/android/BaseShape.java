package io.course.android;

public abstract class BaseShape implements IShape {
    private final String color;

    public BaseShape(String color) {
        this.color = color;
    }

    /**
     * Получить цвет фигуры
     * @return Цвет фигуры типа String
     */
    String getColor() {
        return color;
    }
}
