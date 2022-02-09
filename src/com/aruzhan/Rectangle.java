package com.aruzhan;

public class Rectangle extends com.aruzhan.Shape {
 private double width;
 private double length;

 public Rectangle () {
     length = 1.0;
     width = 1.0;
 }
    public Rectangle (double width, double length) {
     setWidth(width);
     setLength(length);
 }
    public Rectangle (String color, boolean filled, double width, double length) {
     super (color,filled);
     setWidth(width);
     setLength(length);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {return getWidth()*getLength();}
    public double getPerimeter() {return 2*(getWidth()+getLength());}
    @Override
    public String toString() {
     return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + " which is subclass of " + super.toString();
    }
}
