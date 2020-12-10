package com.unia.basicsUpSkill.cicles;

import java.util.HashSet;
import java.util.Set;

public class Task7 {

    //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

    public static void main(String[] args) {
        int a = 13824;
        int b = 32745;
        String s = String.valueOf(a);
        String d = String.valueOf(b);
        String[] array1 = s.split("");
        String[] array2 = d.split("");
        Set<String> set = new HashSet<>();
        for(String s1 : array1){
            for(String s2 : array2){
                if(s1.equals(s2)){
                    set.add(s1); // или s2
                }
            }
        }
        for(String f : set){
            System.out.println(f);
        }





    }
}
