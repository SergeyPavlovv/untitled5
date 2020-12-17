package com.unia.basicsUpSkill.linearPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task6 {

    //Для данной области составить линейную программу, которая печатает true,
    // если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

    public static void main(String[] args) {

        int x = 2;
        int y = 1;

        int squareX = 2;
        int squareX2 = -2;
        int squareY = 4;
        int squareY2 = 0;

        boolean squareCheckX = squareX >= x && squareX2 <= x;
        boolean squareCheckY = squareY >= y && squareY2 <= y;
        boolean square = squareCheckX && squareCheckY;


        int rectangleX = 4;
        int rectangleX2 = -4;
        int rectangleY = -3;
        int rectangleY2 = 0;

        boolean rectangleCheckX = rectangleX >= x && rectangleX2 <= x;
        boolean rectangleCheckY = rectangleY >= y && rectangleY2 <= y;
        boolean rectangle = rectangleCheckX && rectangleCheckY;

        boolean figure = square || rectangle;


        System.out.println(figure);
    }
}
