package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task10 {

    // Найти положительные элементы главной диагонали квадратной матрицы.

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    System.out.print(matrix[i][j] + "\t");
                }

            }
            System.out.println();
        }
    }
}
