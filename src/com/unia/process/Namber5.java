package com.unia.process;

import java.util.Scanner;

public class Namber5 {
    //Ввести число от 1 до 12. Вывести на консоль название месяца,
    // соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Месяц введен некорректно, введите число от 1 до 12");
        } else {
            System.out.println(getMonth(month));
        }

    }

    private static String getMonth(int month) {
        String monthName = null;
        if (month == 1) {
            monthName = "Январь";
        }else if( month == 2){
            monthName = "Февраль";
        }else if (month == 3){
            monthName = "Март";
        }else if (month == 4){
            monthName = "Апрель";
        }else if (month == 5){
            monthName = "Май";
        }else if (month == 6){
            monthName = "Июнь";
        }else if (month == 7){
            monthName = "Июль";
        }else if (month == 8){
            monthName = "Август";
        }else if (month == 9){
            monthName = "Сентябрь";
        }else if (month == 10){
            monthName = "Октябрь";
        }else if (month == 11){
            monthName = "Ноябрь";
        }else if (month == 12){
            monthName = "Декабрь";
        }
        // else {  monthName = "неизвестно";}
        return monthName;
    }
}

