package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    //Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    public static void main(String[] args) throws IOException {

        int n = readMatrixSize();
        int[][] matrix =  createMatrix(n);

        printMatrix(matrix);
    }

    private static int readMatrixSize() throws IOException {

        int number;
        System.out.println("Введите четное число больше нуля: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());
        if (number % 2 != 0 || number <= 1) {
            System.out.println("Ошибка ввода числа ");
            number = readMatrixSize();
        }
        return number;
    }

    private static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];

        int z = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < z) {
                    matrix[i][j] = i + 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
            z--;
        }
        return matrix;
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
