package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task1 {

    //  Написать метод(методы) для нахождения наибольшего общего делителя
    //  и наименьшего общего кратного двух натуральных чисел: (НОК(А,В))=(А*В)/(НОД(А,В))

    public static void main(String[] args) {
        int a = 14;
        int b = 28;
        nod(a, b);
        System.out.println(nod(a,b));
        nok(a, b);
        System.out.println(nok(3, 4));
    }

   private static int nod(int a, int b) { //  находим наибольший общий делитель
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }

        return a;
    }

   private static int nok(int a, int b) {// находим наименьшее общее кратное чисел

        return  a / nod(a,b) * b;
    }
}