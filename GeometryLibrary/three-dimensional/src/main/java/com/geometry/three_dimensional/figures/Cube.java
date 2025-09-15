package com.geometry.three_dimensional.figures;

import com.geometry.base.GeometricFigure;
import com.geometry.three_dimensional.base.ThreeDFigure;

public class Cube extends GeometricFigure implements ThreeDFigure {
    private final double side;

    public Cube(double side) {
        if (side <= 0) throw new IllegalArgumentException("Сторона должна быть положительной");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * calculateArea();
    }
}
