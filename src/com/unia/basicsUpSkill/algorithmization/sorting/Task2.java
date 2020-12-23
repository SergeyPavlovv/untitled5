package com.unia.basicsUpSkill.algorithmization.sorting;

public class Task2 {

    // Реализуйте сортировку выбором.

    public static void main(String[] args) {
        int[] a = {24, 8, 7, 9, 1, 11, 4};
        selectionSort(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}
