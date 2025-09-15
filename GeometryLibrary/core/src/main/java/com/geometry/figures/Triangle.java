package com.geometry.figures;

import com.geometry.base.GeometricFigure;

public class Triangle extends GeometricFigure {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        validateSides(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void validateSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны должны быть положительными");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Некорректные размеры треугольника");
        }
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
