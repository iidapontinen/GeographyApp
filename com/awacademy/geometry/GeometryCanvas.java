package com.awacademy.geometry;

import com.awacademy.geometry.base.Point;

public class GeometryCanvas {

    public static void main(String[] args) {

        Point p1 = new Point(1, 2);

        Point p2 = new Point(5, 10);

        //double distance = Math.sqrt(Math.pow(point2_x - point1_x, 2) + Math.pow(point2_y - point1_y, 2));
        double distance = Math.sqrt(Math.pow(p2.getxCoordinate() - p1.getxCoordinate(), 2) + Math.pow(p2.getyCoordinate() - p1.getyCoordinate(), 2));

        System.out.println("The distance is: " + distance);

        p2.moveHorizontally(5);
        System.out.println("the current coordinates of p2 are: " + p2.getxCoordinate() + ", " + p2.getyCoordinate());
        System.out.println("the current coordinates of p2 are: " + p1.getxCoordinate() + ", " + p1.getyCoordinate());

        double calculatedDistance = p1.distance(p2);
        System.out.println("Distance of the two coordinates is: " + calculatedDistance);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
