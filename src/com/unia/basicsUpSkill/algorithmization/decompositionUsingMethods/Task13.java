package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task13 {

    //Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    // Найти и напечатать все пары «близнецов» из отрезка [n,2n],
    // где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

    //создать отрезок (n, 2n)
    //занести числа "близнецы" в лист
    // вывести числа

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число больше 2:");
        int n = readNumber();
        lineSegment(n);
        listPrint(lineSegment(n));
    }

    public static ArrayList<Integer> lineSegment(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n; i < (2 * n); i++) {
            if (i % 2 != 0) {
                list.add(i);
            }

        }
        return list;
    }

    public static void listPrint(ArrayList<Integer> list) {
        for (int i : list)

            System.out.print(i + " : ");
    }

    public static int readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        return n;
    }

}
