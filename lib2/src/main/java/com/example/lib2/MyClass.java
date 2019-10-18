package com.example.lib2;

public class MyClass {
    public static void main(String[] args){
        Rectangle rectObj = new Rectangle(1, 2 ,5 ,5);
        Circle cirObj = new Circle(1, 1, 5);
        Line lineObj = new Line(1, 1, 2, 2);

        rectObj.draw();
        cirObj.draw();
        lineObj.draw();
    }
}
