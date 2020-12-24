package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;


import java.util.Arrays;


public class Task13 {

    //Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

    public static void main(String[] args) {
        int[][] matrix = {
                {9, 31, 2, 3, 4, 5},
                {12, 6, 7, 8, 9, 10},
                {11, 1, 12, 13, 14, 15},
                {16, 17, 3, 18, 19, 20},
                {21, 22, 23, 7, 24, 25},
        };

        sortMatrixColumns(matrix);
        printMatrix(matrix);
        System.out.println();
        sortMatrixColumnsRevers(matrix);
        printMatrix(matrix);
    }

    private static void sortMatrixColumns(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            sortMatrixColumn(matrix, i);
        }
    }

    private static void sortMatrixColumn(int[][] matrix, int column) {
        int[] temp = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[i][column];
        }
        Arrays.sort(temp);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = temp[i];
        }
    }

    private static void sortMatrixColumnsRevers(int[][] matrix){

        for (int i = 0; i < matrix[0].length; i++) {
            sortMatrixColumnRevers(matrix, i);
        }
    }

    private static void sortMatrixColumnRevers(int[][] matrix, int column) {
        int[] temp = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            temp[i]= matrix[i][column];
        }
        sortArrayColumnRevers(temp);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = temp[i];
        }
    }

    private static void sortArrayColumnRevers(int[] array) {
        int temp = 0;
        boolean sortingFinished = false;

        while (!sortingFinished) {
            sortingFinished = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    sortingFinished = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
