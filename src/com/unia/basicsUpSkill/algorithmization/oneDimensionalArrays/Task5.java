package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    // Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < size; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}
