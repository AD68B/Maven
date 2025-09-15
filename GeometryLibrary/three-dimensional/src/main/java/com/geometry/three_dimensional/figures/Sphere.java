package com.geometry.three_dimensional.figures;

import com.geometry.base.GeometricFigure;
import com.geometry.three_dimensional.base.ThreeDFigure;

public class Sphere extends GeometricFigure implements ThreeDFigure {
    private final double radius;

    public Sphere(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
