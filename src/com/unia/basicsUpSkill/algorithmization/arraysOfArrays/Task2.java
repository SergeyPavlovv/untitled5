package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task2 {

    // Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

    public static void main(String[] args) {
        int [] [] matrixA = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i == j){
                    System.out.println(matrixA[i] [j]);
                }
            }
        }



    }
}
