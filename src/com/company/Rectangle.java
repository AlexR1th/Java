package com.company;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }//называется КОНСТРУКТОР

    public Rectangle() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimetr (){
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + getArea() +
                '}';
    }
}
