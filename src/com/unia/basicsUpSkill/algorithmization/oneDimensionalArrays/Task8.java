package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Task8 {

    //Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность,
    // выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

    public static void main(String[] args) {
        int[] array = new int[12];
        Arrays.sort(array);
        int newArraySize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == array[i]) {
                array[i] = 0;
            } else {
                newArraySize++;
            }
        }
        int[] array2 = new int[newArraySize];
        int index = 0;
        for (int i : array) {
            if (array[i] != 0) {
                array2[index] = i;
                index++;
            }
        }
    }
}
