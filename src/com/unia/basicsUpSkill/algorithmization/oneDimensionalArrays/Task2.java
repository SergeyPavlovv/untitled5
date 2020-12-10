package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Task2 {

    //Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    // Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

    public static void main(String[] args) {

        int[] array = {1, 5, 10, 3, 7, 9, 18, 8, 11};
        int z = 9;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println("Количество замен в массиве: " + count);
        System.out.println(Arrays.toString(array));

    }
}
