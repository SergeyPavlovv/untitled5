package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task7 {

    // Сформировать квадратную матрицу порядка N по правилу:
    //     A[i,j]=sin((i^2-j^2)/N)
    //и подсчитать количество положительных элементов в ней.
// считать из консоли
//создать и заполнить матрицу
    // вывести матрицу
    //подсчет положительных элементов и вывод

    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int n = 2;
        double d = Math.sin((Math.pow(i,2) - Math.pow(j,2))/ n);
        System.out.println(d);
    }
}
