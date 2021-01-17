package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    private int x;
    private int y;
    private int z;

    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public static double distance3d(int x1, int y1, int z1, int x2, int y2, int z2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2) + pow(z1 - z2, 2));
    }

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2)
                + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2)
                + pow(this.y - that.y, 2)
                + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(3, 2, 2);
        Point d = new Point(0, 5, 2);
        double dist = a.distance(b);
        System.out.println(dist);
        double dist3d = c.distance3d(d);
        System.out.println(dist3d);
    }
}