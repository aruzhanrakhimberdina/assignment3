package com.aruzhan;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Circle cir = new Circle();
    Rectangle rect = new Rectangle();
    Square squ = new Square();

    System.out.println(cir.toString());
    System.out.println("The area of the Circle = " + cir.getArea());
    System.out.println("The perimeter of the Circle = " + cir.getPerimeter());

    System.out.println(rect.toString());
    System.out.println("The area of the Rectangle = " + rect.getArea());
    System.out.println("The perimeter of the Rectangle = " + rect.getPerimeter());

    System.out.println(squ.toString());
    System.out.println("The area of the Square = " + squ.getArea());
    System.out.println("The perimeter of the Square = " + squ.getArea());
    }
}
