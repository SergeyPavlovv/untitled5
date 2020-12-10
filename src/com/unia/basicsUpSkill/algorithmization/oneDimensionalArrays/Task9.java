package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

import java.util.HashMap;
import java.util.Map;

public class Task9 {

    // В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    // Если таких чисел несколько, то определить наименьшее из них.

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 2, 4, 2, 7, 99, 12, 11, 33, 33};

        searchNumbers(array);
    }

    public static void searchNumbers(int[] array) {
        int[] testArray = new int[array.length];
        int bigCount = 0;

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    count++;
                }
            }
            testArray[i] = count;
            if (count > bigCount) {
                bigCount = count;
            }
        }
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] == bigCount && array[i] < res) {
                res = array[i];
            }
        }
        System.out.println(res);
    }
}