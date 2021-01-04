package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task16 {

    //Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    // Определить также, сколько четных цифр в найденной сумме.
    // Для решения задачи использовать декомпозицию.

    //пишем метод для считывания числа
    //пишем метод для нахождения суммы нечетных цифр числа n
    //пишем метод для нахождения в сумме нечетных цифр, количество четных цифр

    public static void main(String[] args)  {

        try {
            int number = readNumber();
            sumOddNumbers(number);
            System.out.println("Сумма нечетных цифр числа n равна: " + sumOddNumbers(number));
            int evenSum = sumEvenNumbersOddNumber(sumOddNumbers(number));
            System.out.println("Сумма четных цифр, суммы нечетных цифр числа n: " + evenSum);
        } catch (Exception e){
            System.out.println(e.toString());
            System.out.println("Ошибка ввода, пробуйте еще.");
        }
    }

    private static int readNumber() throws Exception {

            System.out.println("Введите число больше 2, но меньше миллиарда: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            if (a < 2) {
                System.out.println("Ошибка ввода, пробуйте еще.");
            }

        return a;
    }

    private static int sumOddNumbers(int number) {
        int sum = 0;
        while (number != 0) {
            if ((number % 10) % 2 != 0) {
                sum += (number % 10);
            }
            number /= 10;
        }

        return sum;
    }

    private static int sumEvenNumbersOddNumber(int number) {
        int evenSum = 0;
        while (number != 0) {
            if ((number % 10) % 2 == 0) {
                evenSum += (number % 10);
            }
            number /= 10;
            System.out.println(evenSum);
        }

        return evenSum;
    }
}
