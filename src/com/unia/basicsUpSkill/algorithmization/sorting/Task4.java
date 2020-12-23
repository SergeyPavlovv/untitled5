package com.unia.basicsUpSkill.algorithmization.sorting;

public class Task4 {

    // Реализуйте сортировку вставками.

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2, 9, 7, 8};
        insertionSort(array);
        printArray(array);

    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }
    }
    private static void printArray(int[] array){
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
