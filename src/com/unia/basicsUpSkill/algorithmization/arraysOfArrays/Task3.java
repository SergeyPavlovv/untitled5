package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task3 {

    // Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        System.out.print("строка матрицы: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("столбец матрицы: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    System.out.print(matrix[i][j] + " ");

                }
            }
        }
    }
}
