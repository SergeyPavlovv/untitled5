package com.unia.process;

import java.util.Random;
import java.util.Scanner;

    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

    public class Namber3 {
        public static void main(String[] args) {
            //  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
            Scanner scr = new Scanner(System.in);
            int count = scr.nextInt();
            Random random = new Random();
            for (int x = 0; x < count; x++) {
                int randomInt = random.nextInt();
                if (x % 2 == 0) {
                    // проверить четность ?
                    System.out.println(randomInt);
                } else {
                    System.out.print(randomInt + " ");
                }
            }



        }
    }


