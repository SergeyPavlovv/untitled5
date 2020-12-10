package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Task6 {

    // Задана последовательность N вещественных чисел.
    // Вычислить сумму чисел, порядковые номера которых являются простыми числами.

    public static void main(String[] args) {
        double[] array = {2.3, 5.1, 6.7, 5.9, 23.0, 34.6, 11.0, 2.3, 11.1, 45, 7};
        Arrays.sort(array);
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (isElement(i)) ;
            sum += array[i];

            System.out.println(sum);
        }

    }

    public static boolean isElement(int a) {

        boolean res = true;

        if (a < 2) {
            res = false;
        }
        int temp;

        for (int i = 2; i <= a / 2; i++) {
            temp = a % i;
            if (temp == 0) {
                res = false;
            }
        }
        return res;
    }
}
