package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    public static void main(String[] args) throws IOException {

        int n = readMatrixSize();
        int[][] matrix = new int[n][n];
        createMatrix(matrix);
        printMatrix(matrix);

    }

    private static int readMatrixSize() throws IOException {

        int number;
        System.out.println("Введите четное число больше нуля: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());

        if (number <= 1 || number % 2 != 0) {
            System.out.println("Ошибка ввода, введите правильное число.");
            return readMatrixSize();
        }
        return number;
    }

    private static void createMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = i % 2 == 0 ? j + 1 : matrix.length - j;
                //или другой способ
//                matrix[i][j] = j + 1;
//                if (i % 2 == 0) {
//                    matrix[i][j] = matrix.length - j;
//                }
            }
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
