package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

import java.util.Arrays;

public class Task4 {

    // Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

    public static void main(String[] args) {

        int array[] = {7, 5, 3, 4, 1, 10, 2, 8, 9, 6};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[array.length -1];

       array[0] = max;
       array[array.length-1] = min;

        System.out.println(Arrays.toString(array));
    }
}
