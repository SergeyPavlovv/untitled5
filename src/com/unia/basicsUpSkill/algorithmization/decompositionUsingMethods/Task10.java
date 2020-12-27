package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task10 {

    // Дано натуральное число N. Написать метод(методы)
    // для формирования массива, элементами которого являются цифры числа N.

    public static void main(String[] args) {
        int n = 3564;
        int[] array = new int[indexArray(n)];
       arrayNumber(array, n);
       for(int i : arrayNumber(array, n)){
           System.out.print( i + " ");
       }

    }
    private static int indexArray(int n){
        int count = 0;
        while (n>0){
            count++;
            int i = n%10;
            n/=10;
        }

        return count;
    }
    private static int[] arrayNumber(int[] a, int n){

        int[] array = new int[indexArray(n)];
       for(int i = 0; i < array.length; i++){
            array[i] = n % 10;
            n /= 10;
        }
       return array;
    }

}
