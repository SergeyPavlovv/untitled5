package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task17 {

    //Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    // Сколько таких действий надо произвести, чтобы получился нуль?
    // Для решения задачи использовать декомпозицию.

    //задать число
    //посчитать сумму его цифр
    //в цикле посчитать сколько раз можно вычесть сумму цифр из числа

    public static void main(String[] args) {
        try {
            int num = readerNumber();
            int sum = sumNumber(num);
            int count = countActions( num, sum );
            System.out.println("Количество действий: " + count);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Ошибка ввода, пробуйте еще.");
        }

    }

    /**
     * задаем число
     *
     * @return
     * @throws Exception
     */
    private static int readerNumber() throws Exception {
        System.out.println("Введите положительное число в диапазоне int: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        return num;
    }

    /**
     * считаем сумму цифр числа num
     * @param num
     * @return
     */
    private static int sumNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int a = num % 10;
            sum += a;
            num /= 10;
        }
        return sum;
    }

    /**
     * считаем сколько раз можно вычесть сумму цифр из числа
     * @param num
     * @param sum
     * @return
     */
    private static int countActions (int num, int sum){
        int count = 0;
        int temp = 0;
        while (num >0){
            temp = num - sum;
            num = temp;
           count++;
        }
        return count;
    }
}
