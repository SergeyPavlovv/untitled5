package com.unia.basicsUpSkill.linearPrograms;

public class Task2 {

    //    Вычислить значение выражения по формуле (все переменные принимают действительные значения):

    public static void main(String[] args) {


        double a = 3.0;
        double b = 2.1;
        double c = 4.2;

        double d = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Результат выражения: " + d);


    }
}
