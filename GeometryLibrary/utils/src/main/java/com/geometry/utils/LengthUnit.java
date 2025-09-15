package com.geometry.utils;

public enum LengthUnit {
    METERS(1.0),         // Метры (базовая единица)
    CENTIMETERS(0.01),   // Сантиметры
    MILLIMETERS(0.001),  // Миллиметры
    KILOMETERS(1000.0),  // Километры
    INCHES(0.0254),      // Дюймы
    FEET(0.3048);        // Футы

    private final double metersMultiplier;

    LengthUnit(double metersMultiplier) {
        this.metersMultiplier = metersMultiplier;
    }

    public double toMeters(double value) {
        return value * metersMultiplier;
    }

    public double fromMeters(double meters) {
        return meters / metersMultiplier;
    }
}
