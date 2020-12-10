package com.unia.basicsUpSkill.cicles;

public class Task5 {

    // Вывести на экран соответствий между символами и их численными обозначениями
    // в памяти компьютера.

    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {

            System.out.println(i + " - " + (char) i); //ASCII
        }
    }
}
