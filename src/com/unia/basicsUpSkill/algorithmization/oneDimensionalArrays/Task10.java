package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Task10 {

    //Дан целочисленный массив с количеством элементов п.
    // Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int newArraySize = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            } else {
                newArraySize++;
            }
        }
        int[] array2 = new int[newArraySize];
        int index = 0;
        for (int i : array) {
            if (i != 0) {
                array2[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
