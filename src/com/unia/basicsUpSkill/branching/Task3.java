package com.unia.basicsUpSkill.branching;

public class Task3 {

    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены
    // на одной прямой.

    public static void main(String[] args) {

        int x1 = 2;
        int y1 = 2;

        int x2 = 3;
        int y2 = 5;

        int x3 = 4;
        int y3 = 4;

        boolean pointsBelongsToOneLine = ((x3 - x1)/(x2 - x1) == (y3 - y1)/ (y2 - y1));

            System.out.println(pointsBelongsToOneLine);
        }
    }

