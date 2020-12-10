package com.unia.basicsUpSkill.branching;

public class Task2 {

    // Найти max{min(a, b), min(c, d)}

    public static void main(String[] args) {

        int a = 15;
        int b = 30;
        int c = 19;
        int d = 2;

        int min = Math.min(a, b);
        int max = Math.max(c, d);

        System.out.println(min + " " + max);
    }
}
