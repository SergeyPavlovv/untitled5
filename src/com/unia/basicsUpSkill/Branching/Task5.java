package com.unia.basicsUpSkill.Branching;

public class Task5 {

    // Вычислить значение функции:

    public static void main(String[] args) {
        int x = 8;

        if( x <= 3){
         int f = x*x -3 * x + 9;
            System.out.println(f);
        } else {
          double s = 1/(Math.pow(x,3) + 6);
            System.out.println(s);
        }

    }
}
