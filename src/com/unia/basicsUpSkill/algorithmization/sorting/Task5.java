package com.unia.basicsUpSkill.algorithmization.sorting;

public class Task5 {

    // Реализуйте сортировку Шелла.

    public static void main(String[] args) {
        int[] array = {5, 7, 6, 3, 8, 2, 9, 1, 4};
        shellSort(array);
        printArray(array);
    }

    private static void shellSort(int[] numbers) {
        int j;
        for (int gap = numbers.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < numbers.length; i++) {
                int temp = numbers[i];
                for (j = i; j >= gap && numbers[j - gap] > temp; j -= gap) {
                    numbers[j] = numbers[j - gap];
                }
                numbers[j] = temp;
            }
        }
    }

    private static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
