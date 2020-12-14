package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    // В числовой матрице поменять местами два столбца любых столбца, т. е.
    // все элементы одного столбца поставить на соответствующие им позиции другого,
    // а его элементы второго переместить в первый.
    // Номера столбцов вводит пользователь с клавиатуры.


            // создать переменную num и добавить в  нее matrix [i][a]
            // перемещаем столбец b в a
            // вставить столбец а на место b


    public static void main(String[] args) throws IOException {

        int[][] matrix = {
        {9, 31, 2, 3, 4, 5},
        {12, 6, 7, 8, 9, 10},
        {11, 1, 12, 13, 14, 15},
        {16, 17, 3, 18, 19, 20},
        {21, 22, 23, 7, 24, 25},
        };

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Введите первый номер столбца от 0 до 4: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println(" Введите второй номер столбца от 0 до 4: ");
        int b = Integer.parseInt(reader.readLine());

           for (int i = 0; i < 5; i++) {
               int num = matrix [i][a];
               matrix[i][a] = matrix[i][b];
               matrix[i][b] = num;
           }

        for(int i = 0; i < matrix.length; i++){
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    }
}

