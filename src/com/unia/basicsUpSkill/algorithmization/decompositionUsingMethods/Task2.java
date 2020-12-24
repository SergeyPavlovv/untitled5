package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

import java.util.Arrays;

public class Task2 {

    //Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

    public static void main(String[] args) {
        int[] array = {8, 12, 16, 4};
        Arrays.sort(array);
        int a = array[0];
        int b = array[1];
        nod(a, b);
        for (int i = 2; i < array.length; i++) {
            a = nod(a, array[i]);
        }
        System.out.println(a);
    }

    private static int nod(int a, int b) { //  находим наибольший общий делитель двух чисел
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}

