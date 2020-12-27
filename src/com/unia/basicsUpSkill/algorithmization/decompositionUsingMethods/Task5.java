package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task5 {

    // Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
    // которое меньше максимального элемента массива, но больше всех других элементов).

    public static void main(String[] args) {

        int[] array = {3, 6, 9, 12, 45, 53, 1, 8, 19, 11, 44, 9};
        Arrays.sort(array);
        System.out.println("Второе по величине число: " + array[10]);

        System.out.println("Второе по величине число: " + getMax2(array));

    }

    public static int getMax2(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max2) {
                max2 = arr[i];
            }

            if (max2 > max1) {
                int temp = max1;
                max1 = max2;
                max2 = temp;
            }
        }
        return max2;
    }

}
