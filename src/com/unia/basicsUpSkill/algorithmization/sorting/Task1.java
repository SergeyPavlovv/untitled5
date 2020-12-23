package com.unia.basicsUpSkill.algorithmization.sorting;

public class Task1 {

    //Заданы два одномерных массива с различным количеством элементов и натуральное число k.
    // Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
    // при этом не используя дополнительный массив.

    public static void main(String[] args) {

        int[] a = {6, 8, 7, 9, 1, 11, 4};
        int[] b = {12, 23, 70, 34};
        int k = 2;
        int[] unite = uniteArrays(a, b, k);
        printArray(unite);

    }

 
    private static int[] uniteArrays(int[] a, int[] b, int k) {

        int[] unite = new int[a.length + b.length];

        for (int i = 0; i < k; i++) {
            unite[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            unite[k + i] = b[i];
        }
        for (int i = k; i < a.length; i++) {
         unite[i + b.length] = a[i];
        }
        return unite;
    }

    private static void printArray(int[] unite) {
        for (int i : unite) {
            System.out.println(i + " ");
        }
    }
}
