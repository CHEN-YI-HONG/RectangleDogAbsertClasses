package com.example.lib2;

public class Circle extends GraphicsObject	{
    public int Radius;

    public Circle() {
        Radius = 0;
    }

    public Circle(int a, int b, int r) {
        Origin.x = a;
        Origin.y = b;
        Radius = r;
    }

    public void draw() {   // 必須填上 abstract method 的實作內容
        System.out.println("Circle has been drawn at \n" +
                "Center: (" + Origin.x + ", " + Origin.y + ")\n" +
                "Radius: " + Radius);
    }
}
