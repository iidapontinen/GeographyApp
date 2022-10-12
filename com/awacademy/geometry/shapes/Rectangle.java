package com.awacademy.geometry.shapes;

import com.awacademy.geometry.base.Point;

public class Rectangle {

    Point topCorner;
    int side1;
    int side2;

    public Rectangle(Point topCorner, int side1, int side2) {
        this.topCorner = topCorner;
        this.side1 = side1;
        this.side2 = side2;
    }
}
