package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task9 {

    // Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
    // вычисления его площади, если угол между сторонами длиной X и Y— прямой.

    public static void main(String[] args) {
        double x = 2;
        double y = 4;
        double z = 2;
        double t = 4;
        squareArea(x,y,z,t);
        System.out.println(squareArea(x,y,z,t));

    }
    private static double squareArea( double x, double y, double z, double t){

            double d=Math.sqrt(x*x+y*y);//Диагональ напротив прямого угла, нашли по теореме Пифагора
            double s1=x*y*0.5;//Первая часть площади четырехугольника
            double s2=0.25*Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));//Вторая часть площади четырехугольника, найдено по формуле Герона
            double s=s1+s2;
           return s;
            }
}