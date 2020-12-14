package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task1 {

    //Дана матрица. Вывести на экран все нечетные столбцы,
    // у которых первый элемент больше последнего.

    public static void main(String[] args) {
        int[] [] matrixA = {
                {77,6,7,8,6},
                {19,3,76,8,7},
                {42,11,5,9,11},
                {1,56,81,22,4},
                {5,2,5,39,4}
        };
        System.out.println("нечетные столбцы матрицы по условию:");
        for (int i = 0; i < 5; i++){
            for(int j =0; j<5; j +=2){
                if(matrixA[0] [j] > matrixA[5-1] [j]);
                System.out.print(matrixA[i] [j] + " " + "\t");
            }
            System.out.println();
        }
    }
}
