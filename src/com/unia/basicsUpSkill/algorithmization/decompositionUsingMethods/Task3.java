package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task3 {

    // Вычислить площадь правильного шестиугольника со стороной а,
    // используя метод вычисления площади треугольника.

    public static void main(String[] args) {
        int a = 6;
        double areaHexagon = areaTriangle(a) * 6;
        System.out.println("площадь правильного шестиугольника: " + areaHexagon);
    }

    private static double areaTriangle(int a) {
        double pp = (a + a + a) / 2.0; // полупериметр
        return Math.sqrt(pp * (pp - a) * (pp - a) * (pp - a));

    }
}
