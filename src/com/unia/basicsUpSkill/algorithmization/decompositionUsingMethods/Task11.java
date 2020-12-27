package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task11 {

    // Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

    public static void main(String[] args) {
        int a = 23456;
        int b = 12345678;

        number1(a);
        number2(b);

        if(number1(a)>number2(b)){
            System.out.println("больше цифр в числе: " + a);
        }else {
            System.out.println("больше цифр в числе: " + b);
        }
        
    }

    private static int number1(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            int i = n % 10;
            n /= 10;
        }
        return count;
    }
    private static int number2(int a) {
        int count = 0;
        while (a > 0) {
            count++;
            int i = a % 10;
            a /= 10;
        }
        return count;
    }
}
