package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

import java.util.*;

public class Task9 {

    //Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    // Определить, какой столбец содержит максимальную сумму.

    //создать матрицу
    //посчитать сумму элементов в столбцах занести в массив?
    //найти номер столбца maximum


    public static void main(String[] args)  {

        int[][] matrix = {
                {9, 31, 2, 3, 4, 5},
                {12, 6, 7, 8, 9, 10},
                {11, 1, 12, 13, 14, 15},
                {16, 17, 3, 18, 19, 20},
                {21, 22, 23, 7, 24, 25},
        };

             int max = 0;
             int index =0;

        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];

                if(sum > max){
                    max = sum;
                    index = i;
                }

            }
            System.out.print(sum + " ");
        }

        System.out.println();
        System.out.println( "Номер столбца: " + index + " Максимальная сумма столбца: " + max);



    }
}
