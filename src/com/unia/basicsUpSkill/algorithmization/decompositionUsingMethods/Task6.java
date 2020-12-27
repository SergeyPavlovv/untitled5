package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task6 {

    // Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

    public static void main (String[] args)  {
       int a = 14;
       int b = 31;
       int c = 25;
       testCoprimeNumbers(a, b, c);
        System.out.println(testCoprimeNumbers(a, b, c));
    }
    public static int coprimeNumbers(int b, int a) {

        if (a > b) {
            return coprimeNumbers(a,b);
        }
        if (a==0){
            return b;
        }
        return coprimeNumbers(a,b%a);
    }
    public static int coprimeNumbers2(int b, int c){
        if (c > b){
            return coprimeNumbers(c,b);
        }
        if (c==0){
            return b;
        }
        return coprimeNumbers(c,b%c);
    }
    public  static int coprimeNumbers3(int a, int c){
        if(a > c){
            return coprimeNumbers(a, c);
        }
        if(a==0){
            return c;
        }
        return coprimeNumbers(a,c%a);
    }

    public static boolean testCoprimeNumbers(int a, int b, int c) {
        return (coprimeNumbers(a,b)==1 && coprimeNumbers2(b,c)==1 && coprimeNumbers3(a,c)==1);
    }
}
