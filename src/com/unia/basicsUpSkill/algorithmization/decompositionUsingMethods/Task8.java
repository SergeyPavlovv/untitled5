package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task8 {

    //Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].

    public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sumIntervalArray(array, 3,5));
    }
    private static int sumIntervalArray(int[] array, int k, int t){
        int sum = 0;
        for(; k<=t; k++){
            sum+=array[k];
        }
        return sum;
    }
}
