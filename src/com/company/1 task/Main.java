package com.company;

public class Main {

    static class Point {
        double x;
        double y;
    }

    public static void main(String[] args) {
        Point a = new Point();
        a.x = 0.0;
        a.y = 0.0;

        Point b = new Point();
        b.x = 2.0;
        b.y = 0.0;

        Point c = new Point();
        c.x = 0.0;
        c.y = 2.0;
        System.out.println("Площадь треугольника = " + solve(a,b,c));
    }

    public static double solve(Point a, Point b, Point c) {
        double x, y, z, p;
        x = side(a, b);
        y = side(b, c);
        z = side(a, c);
        p = (x + y + z) / 2;
        if (isTriangle(x, y, z)) {
            return Math.sqrt(p * (p - x) * (p - y) * (p - z));
        }else return 0;
    }

    public static double side(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static boolean isTriangle(double x, double y, double z) {
        if (x + y > z && x + z > y && y + z > x) {
            return true;
        }
        return false;
    }

}
