package com.unia.basicsUpSkill.algorithmization.oneDimensionalArrays;

public class Task3 {

    //Дан массив действительных чисел, размерность которого N.
    // Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

    public static void main(String[] args) {

        int[] array = {-5, 12, 0, 0, 43, -8, 543, 4, -45, 11};
        int count1 = 0;//negative
        int count2 = 0;//positive
        int count3 = 0;//null

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count1++;
            }
            if(array[i] > 0){
                count2++;
            }
            if(array[i] == 0){
                count3++;
            }
            }
        System.out.println("Отрицательных: " + count1 + "\n" + "Положительных: " + count2 + "\n" + "Нулевых элементов: " + count3);
        }
    }
