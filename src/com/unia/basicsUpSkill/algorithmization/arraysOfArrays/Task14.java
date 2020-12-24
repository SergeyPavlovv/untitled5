package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task14 {

    //Сформировать случайную матрицу m x n,
    // состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

    public static void main(String[] args) {

        int size = createMatrix();
        int[][] matrix = formMatrix(size);
        printMatrix(matrix);
    }


    private static int createMatrix() {

        int min = 3;
        int max = 15;
        double d = (Math.random() * ((max - min) + 1)) + min;
        return (int) d;
    }


    private static int[][] formMatrix(int size) {

        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i <= j) {
                    matrix[i][j] = 1;
                }
            }
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
