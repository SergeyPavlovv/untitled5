package com.unia.basicsUpSkill.cicles;

import java.math.BigInteger;

public class Task4 {

    // Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {

        //  в long не влезло, пришлось создавать объект

        BigInteger product = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            product = product.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(product);

    }
}
