package com.unia.basicsUpSkill.cicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    // Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите любое целое положительное число: ");

        int x = Integer.parseInt(reader.readLine());
        int sum = 1;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);


    }
}
