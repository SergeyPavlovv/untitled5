package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task12 {

    //Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
    // элементами которого являются числа, сумма цифр которых равна К и которые не большее N.


    //генерируем число
    //проверка числа на ==k
    //числами по условию заполняем массив


    public static void main(String[] args) {

        int k = 4;
        int n = 78;
        int[] array = createArrayNumber(k, n, 5);

        printArray(array);

    }

    /**
     * создаем и заполняем массив А
     * @param k
     * @param n
     * @param arrayLength
     * @return
     */
    private static int[] createArrayNumber(int k, int n, int arrayLength) {

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(k, n);
        }

        return array;
    }

    /**
     * получаем рандомное число в диапозоне не больше N и суммой цифр равной K
     * @param k
     * @param n
     * @return
     */
    private static int randomNumber(int k, int n){
        int temp = 0;
        boolean checkedForK = false;
        while (!checkedForK) {
            temp = ((int) (Math.random() * n));
            checkedForK = checkForK(temp, k);
        }
        return temp;
    }

    /**
     * проверка суммы цифр чила на равенство K;
     * @param number
     * @param k
     * @return
     */
    private static boolean checkForK (int number, int k){
        int sum = 0;
        while (number > 0) {
            int i = number % 10;
            sum += i;
            number /= 10;
        }
        return sum == k;
    }


    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print( i + " ");
        }
    }
}
