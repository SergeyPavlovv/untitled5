package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task11 {

    // Матрицу 10x20 заполнить случайными числами от 0 до 15.
    // Вывести на экран саму матрицу и номера строк, в которых число 5 встречается
    // три и более раз.


    public static void main(String[] args) {

        int[][] matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            int number = 0;
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                    if (count >= 3) {
                        number = i;
                    }
                }
            }
            if (count >= 3) {
                System.out.println("Номер строки: " + number + " где 5 встречается 3 и более раз: " + count);
            }
        }
    }
}
