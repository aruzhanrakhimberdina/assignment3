public class Shape {
    public int area( ){        return 1;    }}public class Rectangle extends Shape {    public int area( ){        return 3;    }}class Main( ){    public static void main(String[ ] args){        Shape shape = new Shape( );        Rectangle rect = new Rectangle( );        shape = rect;        System.out.println(shape.area( ));    }
}
