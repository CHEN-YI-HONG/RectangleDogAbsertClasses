package com.example.lib2;

public class Rectangle extends GraphicsObject {
    public int Length;
    public int Height;
    public Rectangle() {
        Length = 0;
        Height = 0;
    }
    public Rectangle(int Left, int Top, int Len, int High) {
        Origin.x = Left;	Origin.y = Top;
        Length = Len;	Height = High;
    }
    public void draw() {   // 必須填上 abstract method 的實作內容
        System.out.println("Rectangle has been drawn at \n" +
                "(" + Origin.x + ", " + Origin.y + ") - (" +
                (Origin.x+Length) + ", " + Origin.y + ")\n" +
                "(" + Origin.x + ", " + (Origin.y+Height) + ") - (" +
                (Origin.x+Length) + ", " + (Origin.y+Height) + ")");
    }
}
