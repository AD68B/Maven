package com.geometry.utils;

import com.geometry.base.GeometricFigure;
import com.geometry.three_dimensional.base.ThreeDFigure;
import java.util.Comparator;

public class ShapeComparator implements Comparator<GeometricFigure> {
    private final ComparisonCriteria criteria;

    public ShapeComparator(ComparisonCriteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public int compare(GeometricFigure fig1, GeometricFigure fig2) {
        return Double.compare(getValue(fig1), getValue(fig2));
    }

    private double getValue(GeometricFigure figure) {
        return switch (criteria) {
            case AREA -> figure.calculateArea();
            case PERIMETER -> figure.calculatePerimeter();
            case VOLUME -> {
                if (figure instanceof ThreeDFigure threeD) {
                    yield threeD.calculateVolume();
                }
                throw new IllegalArgumentException("3D критерий для 2D фигуры");
            }
        };
    }
}
