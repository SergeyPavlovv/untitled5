package com.unia.basicsUpSkill.linearPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {
    //Для данной области составить линейную программу, которая печатает true,
    // если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

    public static void main(String[] args) {
        Map<Integer, List<Integer>> area = new HashMap<>();
        for (int y = -3; y <= 7; y++) {
            if (y == 0)
                continue;
            ArrayList<Integer> xList = new ArrayList<>();
            if (y < 0) {
                for (int x = -4; x <= 4; x++) {
                    if (x == 0)
                        continue;
                    xList.add(x);
                }
            } else {
                for (int x = -2; x <= 2; x++) {
                    if (x == 0)
                        continue;
                    xList.add(x);
                }
            }
            area.put(y,xList);
        }

        int x = 4;
        int y = 5;
        boolean res = false;

        if(area.containsKey(y)){
            res = area.get(y).contains(x);
        }

        System.out.println(res);
    }
}
