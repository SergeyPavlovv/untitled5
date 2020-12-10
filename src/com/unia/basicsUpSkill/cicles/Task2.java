package com.unia.basicsUpSkill.cicles;

public class Task2 {

    //Вычислить значения функции на отрезке [а,b] c шагом h:

    public static void main(String[] args) {

        int a = 4;
        int b = 10;
        int h = 2;

        for (int x = a; x < b; x = x + h) {
            if (x > 2) {
                System.out.println(x);
            } else {
                System.out.println(-x);
            }
        }
        for (int x = a; x < b; x = x + h){
           int y = x>2? x:-x;
            System.out.println(y);
        }
    }
}
