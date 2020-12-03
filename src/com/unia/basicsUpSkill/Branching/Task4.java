package com.unia.basicsUpSkill.Branching;

public class Task4 {

    // Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // Определить, пройдет ли кирпич через отверстие.

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int x = 5;
        int y = 12;
        int z = 20;

        boolean res;

        if ((a > x && a > y) || (b > x && b > y)) {
            res = true;
        } else if ((a > z && a > y) || (b > z && b > y)) {
            res = true;
        } else if ((a > z && a > x) || (b > z && b > x)) {
            res = true;
        } else {
            res = false;
        }
        System.out.println(res);

    }
}
