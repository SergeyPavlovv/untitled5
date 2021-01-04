package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task11 {

    // Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

    public static void main(String[] args) {
        int a = 23456;
        int b = 12345678;

        number(a);
        number(b);

        if (number(a) > number(b)) {
            System.out.println("больше цифр в числе: " + a);
        } else {
            System.out.println("больше цифр в числе: " + b);
        }

    }

    private static int number(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            int i = n % 10;
            n /= 10;
        }
        return count;
    }

}
