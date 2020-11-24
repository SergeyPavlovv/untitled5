package com.unia.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class OptionalTask2 {
    /*Задание. Ввести с консоли n - размерность матрицы a [n] [n].
     Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора
      случайных чисел (класс Random).
      1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений
         элементов k-го столбца (строки).
      2.       Найти максимальный элемент в матрице и удалить
         из матрицы все строки и столбцы, его содержащие

     */
    public static void main(String[] args) throws IOException {
        OptionalTask2 task2 = new OptionalTask2();
        int n = task2.readMatrixSize();
        int[][] matrix = new int[n][n];

        for (int[] i : matrix) {
            for (int x = 0; x < i.length; x++) {
//                i[x] = new Random().nextInt();
                i[x] = random();
            }
        }
        matrix = task2.removeMaxElement(matrix);
        matrix = task2.sortMatrix(matrix);
        printMatrix(matrix);
    }

    public int[][] removeMaxElement(int[][] matrix) {
        int max = 0;
        int columnIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int x : matrix[i]) { //Взрыв мозга!!!
                if (max < x) {
                    max = x;
                    columnIndex = i;
                }
            }
        }
        matrix[columnIndex] = null;
        return matrix;
    }

    private int readMatrixSize() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int x = Integer.parseInt(s);
        return x;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] y : matrix) {
            if (y != null) {
                for (int x : y)
                    System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    private static int random (){
        int m = 100;
       return  -m + new Random().nextInt(m + m + 1);
    }

    public int[] sortArray(int[] array){
        if(array != null)
                Arrays.sort(array);
        return array;
    }

    public int[][] sortMatrix(int[][] matrix){
        for (int[] x : matrix){
            x = sortArray(x);
        }
        return matrix;
    }
}
