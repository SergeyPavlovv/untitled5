package com.unia.basicsUpSkill.cicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

    // Для каждого натурального числа в промежутке от m до n
    // вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        int delitel;
        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");

            for (int j = 1; j < i; j++) {

                    delitel = i/j;

                if (i % j == 0 && delitel !=i) {
                    System.out.print(delitel + " ");
                }

            }
            System.out.println();
        }

    }
}

