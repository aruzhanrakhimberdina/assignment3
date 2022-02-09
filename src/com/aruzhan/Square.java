package com.aruzhan;

public class Square extends Rectangle{
    private double side;
    public Square() {setSide(side);}
    public Square(String color, boolean filled, double width, double length) {
        super (color, filled, width, length);
        setWidth(side);
        setLength(side);
    }
    public double getSide() {return side;}

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "A Square with side = " + getLength() + " a subclass of " + super.toString();
    }
}
