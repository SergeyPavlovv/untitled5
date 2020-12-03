package com.unia.basicsUpSkill.Branching;

public class Task1 {

    // Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
    // и если да, то будет ли он прямоугольным.

    public static void main(String[] args) {
        int a = 45;
        int b = 90;
        int c = 180 - (a + b);
        if (c > 0 && a > 0 && b > 0) {
            System.out.print("треугольник: true,");
            if (a == 90 || b == 90 || c == 90) {
                System.out.print(" прямоугольный");
            }
        } else {
            System.out.println("треугольник: false");
        }
    }
}
