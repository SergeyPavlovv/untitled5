package com.unia.basicsUpSkill.linearPrograms;

public class Task5 {

    //    5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    //   Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    //
    //ННч ММмин SSc.

    public static void main(String[] args) {

        int time = 7450;
        int hour = 7450/3600;
        int tyme2 = time - (hour * 3600);
        int minuts = tyme2/60;
        int secunds = tyme2 -(minuts*60);

        System.out.println("Дано число: " + time);
        System.out.println("результат: " + hour +" ч. " + minuts + " мин. " + secunds + " сек.");
    }
}
