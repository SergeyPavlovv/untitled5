package com.unia.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Задание. Ввести n чисел с консоли.
 * 1.  Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class OptionalTask1 {
    private List<Integer> readInts() throws IOException {
        List<Integer> listInts = new ArrayList<>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line; // = buffer.readLine();
        while (!(line = buffer.readLine()).equals("exit")) { // замена
            if (!line.isEmpty()) { // если строка не пуста
                Integer a = Integer.parseInt(line);
                listInts.add(a);
            }
            //line = buffer.readLine();
        }
        buffer.close();
        return listInts;
    }

    public void print1() throws IOException {
        List<Integer> list1 = readInts();
        if(list1.size() > 0) {
            TreeMap<Integer, Integer> mapInts = new TreeMap<>();
            for(Integer i :list1){
                Integer l = i.toString().length();
                mapInts.put(l,i);
            }
            int shortestIntLength = mapInts.firstEntry().getKey();
            int shortestInt = mapInts.firstEntry().getValue();
            int longestIntlenght = mapInts.lastEntry().getKey();
            int longestInt = mapInts.lastEntry().getValue();

            System.out.println(shortestInt + " - " + shortestIntLength + " ; " + longestInt + " - " + longestIntlenght);
        }else
            System.out.println("Введите числа");

    }


    public static void main (String[] args) throws Exception {
        OptionalTask1 task1 = new OptionalTask1();
        task1.print1();
    }

}
