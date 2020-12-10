package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

public class Task7 {

    //Даны действительные числа а1 ,а2 ,..., аn. Найти
    // max (a1+a2+a2n-1...,an+an+1)

    public static void main(String[] args) {

        System.out.println(max());

    }

    public static double max() {
        double[] array = new double[10];
        double max = Double.MIN_VALUE;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            max = Double.max(max, array[i] + array[j]);
        }
        return max;
    }
}
