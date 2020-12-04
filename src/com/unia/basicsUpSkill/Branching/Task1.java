package com.unia.basicsUpSkill.Branching;

public class Task1 {

    // Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
    // и если да, то будет ли он прямоугольным.

    public static void main(String[] args) {
        int a = 45;
        int b = 90;
        int c = 180 - (a + b);
        boolean isAllAnglesPositive = c > 0 && a > 0 && b > 0;
        if (isAllAnglesPositive) {
            System.out.print("треугольник: true,");
            boolean isAnyAngelRight = a == 90 || b == 90 || c == 90;
            if (isAnyAngelRight) {
                System.out.print(" прямоугольный");
            }
        } else {
            System.out.println("треугольник: false");
        }
    }
}
