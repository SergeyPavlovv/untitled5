package com.unia.process;

import java.util.Scanner;

public class Namber4 {
// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.


        public static void main(String[] args) {
            System.out.println("введите любое целое положительное число: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("получилось ");
            System.out.println ( sum );
        }

    }
