package com.example.lib2;

import java.awt.Point;

public class Line extends GraphicsObject	{
    public Point End;
    public Line()	{
        End = new Point(0,0);
    }
    public Line(int a, int b, int c, int d)	{
        Origin.x = a; Origin.y = b;
        End = new Point(c, d);
    }
    public Line(Point p1, Point p2)	{
        Origin.x = p1.x; Origin.y = p1.y;
        End = new Point(p2.x, p2.y);
    }
    public void draw() {   // 必須填上 abstract method 的實作內容
        System.out.println ("Line: (" + Origin.x + ", " + Origin.y
                + ") - (" + End.x + ", " + End.y + ")");
    }
}
