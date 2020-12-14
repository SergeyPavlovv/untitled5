package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task7 {

    // Сформировать квадратную матрицу порядка N по правилу:
    //     A[i,j]=sin((i^2-j^2)/N)
    //и подсчитать количество положительных элементов в ней.


// считать из консоли
//создать и заполнить матрицу
    // вывести матрицу
    //подсчет положительных элементов и вывод

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[][] matrix = new double[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (double) Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] > 0) {
                    count += 1;
                }
            }

        }System.out.println("Положительных элементов в матрице: " + count);

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
