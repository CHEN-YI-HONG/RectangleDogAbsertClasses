package com.example.lib;

public class rectangleData {
    int width;
    int length;
    public rectangleData() {
        width = 4;
        length = 8;
    }
    public rectangleData(int wed, int len) {
        width = wed;
        length = len;
    }
    public rectangleData(rectangleData rect) {
        width = rect.width;
        length = rect.length;
    }
    public void showlongANDweight(){
        System.out.println("length:"+length);
        System.out.println("width:"+width);
    }
    public void showarea() {
        System.out.println("area:"+length*width);
    }
    public void drawRect() {
        int i,j;
        if (length>0&&width>0){
            for (i=0;i<width;i++){
                for (j=0;j<length;j++){
                    System.out.print("*");
                }
                System.out.println("");
                }
            }

    }
}
