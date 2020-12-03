package com.unia.basicsUpSkill.linearPrograms;

public class Task1 {

    //Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

    static Double process(double a, double b, double c) {

        double z = ((a - 3) * b / 2) + c;

        System.out.println("результат: " + z);

        return z;
    }

    public static void main(String[] args) {
        process(1.1, 5.7, 7.0);

    }

}
