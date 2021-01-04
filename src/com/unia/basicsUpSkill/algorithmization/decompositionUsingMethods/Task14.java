package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

import static java.lang.Math.pow;

public class Task14 {

    //Натуральное число, в записи которого n цифр, называется числом Армстронга, если
    // сумма его цифр, возведенная в степень n, равна самому числу.
    // Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {


        for (int i = 1; i < 9999; i++) {
            if(checkForArmstrong(i)) {
                System.out.println(i);
            }
        }


    }

    /**
     * находим число Армстронга, если true возвращаем
     * @param a
     * @return
     */
    private static boolean checkForArmstrong(int a){
        boolean res = false;
        int n, temp = 0, count = 0;
        double arm;
        int[] elems = {0, 0, 0, 0};

        for (n = a; n >= 1; count++) {
            elems[count] = n % 10;
            n /= 10;
            temp++;
        }
        arm = pow(elems[0], temp) + Math.pow(elems[1], temp) + pow(elems[2], temp) + Math.pow(elems[3], temp);
        res = arm == a;

        temp = 0;
        count = 0;

        return res;
    }
}
