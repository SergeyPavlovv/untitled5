package com.unia.basicsUpSkill.algorithmization.sorting;

import java.util.Arrays;

public class Task3 {

    //Реализуйте сортировку обменами. (сортировка пузырьком)

    public static void main(String[] args) {
        int[] a = {6, 8, 7, 9, 1, 11, 4};
        bubbleSort(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array) {

        int temp = 0;
        boolean sortingFinished = false;
        while (!sortingFinished) {
            sortingFinished = true;
            for (int i = 0; i < array.length-1 ; i++) {
                if (array[i] > array[i + 1]) {
                    sortingFinished = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
