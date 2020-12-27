package com.unia.basicsUpSkill.algorithmization.decompositionUsingMethods;

public class Task4 {

    //На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
    // между какими из пар точек самое большое расстояние. Указание. Координаты точек занести
    // в массив.

    // задать количество точек n
    // создать  массив координатами точек
    //создать метод находящий расстояния между точками
    // сравнить расстояния между точками
    //найти max

    public static void main(String[] args) {
        Point[] points = new Point[6];
        points[0] = new Point(3, 2);
        points[1] = new Point(5, -2);
        points[2] = new Point(9, 5);
        points[3] = new Point(5, 11);
        points[4] = new Point(9, -1);
        points[5] = new Point(7, 4);

        Cut cut = findMaxCut(points);

        System.out.println("Самое большое расстояние между парами точек: " + cut.start.x + " " +
                cut.start.y + " и " + cut.end.x +" "+ cut.end.y);

    }

    public static Cut findMaxCut(Point[] points) {
        Cut maxCut = null;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Cut temp = new Cut(points[i], points[j]);
                if (maxCut != null) {
                    maxCut = maxGetDistance(maxCut, temp);
                } else {
                    maxCut = temp;
                }
            }
        }
        return maxCut;
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return d;
    }
//    public static void maxGetDistance(Point start, Point end) {
//
//        maxGetDistance(start.x , start.y , end.x, end.y);
//    }

    public static Cut maxGetDistance(Cut cut1, Cut cut2) {

        double lengthCut1 = getDistance(cut1.start.x, cut1.start.y, cut1.end.x, cut1.end.y);

        double lengthCut2 = getDistance(cut2.start.x, cut2.start.y, cut2.end.x, cut2.end.y);

        return lengthCut1 > lengthCut2 ? cut1 : cut2;
    }


    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Cut {
        Point start;
        Point end;
        double length;

        public Cut(Point start, Point end) {
            this.start = start;
            this.end = end;
            this.length = getDistance(start.x, start.y, end.x, end.y);
        }

    }
}
