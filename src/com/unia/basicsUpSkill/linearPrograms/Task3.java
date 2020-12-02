package com.unia.basicsUpSkill.linearPrograms;

public class Task3 {

    //    Вычислить значение выражения по формуле (все переменные принимают действительные значения):

    public static void main(String[] args) {
        double x = 73; // значения в градусах
        double y = 15;

        //преобразование в радианы
        double xRad = x * Math.PI / 180.0;
        double yRad = y * Math.PI / 180.0;

        double res = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad);

        System.out.println("Результат выражения: " + res);

       // System.out.println();
    }
}
