package com.unia.basicsUpSkill.cicles;

import java.awt.color.ProfileDataException;

public class Task5 {

    // Вывести на экран соответствий между символами и их численными обозначениями
    // в памяти компьютера.

    public static void main(String[] args) {

        // TODO: 22.12.2020 What is the range of char type?
        for (int i = 0; i <= 255; i++) {

            System.out.println(i + " - " + (char) i); //ASCII
        }
    }
}
