package com.main.Chapter2.reference.figure;

public class Circle {

    Point point;
    int radius;

    public Circle(Point point, int radius) {
        this.point = new Point(); // 이런 식으로 reference로 객체로 취급 가능
        this.radius = radius;
    }
}
