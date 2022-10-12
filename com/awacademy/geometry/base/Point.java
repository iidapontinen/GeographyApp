package com.awacademy.geometry.base;

public class Point {

    //fields
    private int xCoordinate;
    private int yCoordinate;

    public Point(int firstCoordinate, int secondCoordinate) {
        this.xCoordinate = firstCoordinate;
        this.yCoordinate = secondCoordinate;
    }

    //methods


    @Override
    public String toString() {
        return "Point{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    //non-static method
    public void moveHorizontally(int offset) {
        this.xCoordinate += offset;
    }

    //static method; creates
    public static Point moveAnyPointHorizontally(Point p, int offset) {
        Point newPoint = new Point(p.xCoordinate, p.yCoordinate);
        newPoint.xCoordinate += offset;
        return newPoint;
    }

    public double distance(Point p2) {
        double distance = Math.sqrt(Math.pow(p2.xCoordinate - this.xCoordinate, 2) + Math.pow(p2.yCoordinate - this.yCoordinate, 2));
        return distance;

//    public static double distance(Point p1, Point p2) {
//        //double distance = Math.sqrt(Math.pow(p2.getxCoordinate() - p1.getxCoordinate(), 2) + Math.pow(p2.getyCoordinate() - p1.getyCoordinate(), 2));
//        double distance = Math.sqrt(Math.pow(p2.xCoordinate - p1.xCoordinate, 2) + Math.pow(p2.yCoordinate - p1.yCoordinate, 2));
//        return distance;
    }
}
