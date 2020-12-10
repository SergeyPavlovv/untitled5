package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

public class Task1 {

    // В массив A [N] занесены натуральные числа.
    // Найти сумму тех элементов, которые кратны данному К.

    public static void main(String[] args) {
        int k = 5;
        int sum = 0;

        int[] array = new int[]{2, 10, 30, 25, 7, 90, 45, 38, 76, 43, 15, 60};

        for (int i : array) {
            if (i % k == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
