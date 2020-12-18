package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

import java.util.Arrays;

public class Task12 {

    //  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

    public static void main(String[] args) {

        int[][] matrix = {
                {9, 31, 2, 3, 4, 5},
                {12, 6, 7, 8, 9, 10},
                {11, 1, 12, 13, 14, 15},
                {16, 17, 3, 18, 19, 20},
                {21, 22, 23, 7, 24, 25},
        };

        sortMatrix(matrix);
        printMatrix(matrix);
        System.out.println();
        sortMatrixRevers(matrix);
        printMatrix(matrix);
    }

    private static void sortLine(int[] array) {
        validateArray(array);

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
    private static void sortMatrixRevers(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {

            sortLineRevers(matrix[i]);

        }

    }

    private static void sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {

                sortLine(matrix[i]);

        }

    }

    private static void sortLineRevers(int[] array) {
        validateArray(array);

        int temp = 0;
        boolean sortingFinished = false;
        while (!sortingFinished) {
            sortingFinished = true;
            for (int i = 0; i < array.length-1 ; i++) {
                if (array[i] < array[i + 1]) {
                    sortingFinished = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

    }

    private static void validateArray(int[] array) {
        if (array == null) {
            System.out.println("Array Is Empty");
            return;
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
