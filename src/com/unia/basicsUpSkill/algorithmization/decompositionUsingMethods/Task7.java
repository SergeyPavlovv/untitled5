package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task7 {

    // Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

    public static void main(String[] args) {
        int n = 9;
        sumOddFactorials(n);
        System.out.println(sumOddFactorials(n));

    }

    private static int sumOddFactorials(int a) {
        int result = 1;
        int sum =0;
        for (int i = 1; i <= a; i++) {
            result = result * i;
            if(a%2 !=0){
                sum +=result;
            }
        }
        return sum;
    }
}
