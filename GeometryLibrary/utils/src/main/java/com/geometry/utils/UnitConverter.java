package com.geometry.utils;

public class UnitConverter {

    public static double convertLength(double value,
                                       LengthUnit fromUnit,
                                       LengthUnit toUnit) {
        if (value < 0) throw new IllegalArgumentException("Значение не может быть отрицательным");
        double meters = fromUnit.toMeters(value);
        return toUnit.fromMeters(meters);
    }

    public static double convertArea(double value,
                                     LengthUnit fromUnit,
                                     LengthUnit toUnit) {
        double linearFactor = convertLength(1.0, fromUnit, toUnit);
        return value * Math.pow(linearFactor, 2);
    }

    public static double convertVolume(double value,
                                       LengthUnit fromUnit,
                                       LengthUnit toUnit) {
        double linearFactor = convertLength(1.0, fromUnit, toUnit);
        return value * Math.pow(linearFactor, 3);
    }
}
