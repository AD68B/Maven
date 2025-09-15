package com.geometry.base;

public abstract class GeometricFigure {
    // Абстрактные методы
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Общая логика
    public String getInfo() {
        return String.format(
                "Тип: %s%nПлощадь: %.2f%nПериметр: %.2f",
                this.getClass().getSimpleName(),
                calculateArea(),
                calculatePerimeter()
        );
    }
}
