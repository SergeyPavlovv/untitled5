package com.unia.basicsUpSkill.algorithmization.arraysOfArrays;

public class Task16 {

    //Магическим квадратом порядка n называется квадратная матрица размера nxn,
    // составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
    // каждой строке и каждой из двух больших диагоналей равны между собой.
    // Построить такой квадрат.

    public static void main(String[] args) {
        int [][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14 ,15, 16}
        };

        // Перестановка элементов главной диагонали
        int count = 0;
        for (int i = 0; i < matrix.length/2; i++) {
            int replacement;
            if(i<matrix.length/2) {
                replacement = matrix[i][i];
                matrix[i][i] = matrix[matrix.length-1-count][matrix.length-1-count];
                matrix[matrix.length-1-count][matrix.length-1-count] = replacement;
                count++;
            }
        }
        // Перестановка элементов побочной диагонали
        count = 0;
        for (int i = 0; i <matrix.length/2 ; i++) {
            int replacement;
            if(i<matrix.length/2){
                replacement = matrix[matrix.length - 1 -count][i];
                matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length-1-count];
                matrix[i][matrix.length-1-count] = replacement;
                count++;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] +" " + "\t");
            }
            System.out.println();
        }

    }
}
