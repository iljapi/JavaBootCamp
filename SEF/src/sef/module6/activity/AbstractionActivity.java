package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String arg[]){
        Square p1 = new Square(2);

        p1.setColor("Red");
        System.out.println("Square:");
        System.out.println("Color: "+p1.getColor());
        System.out.println("Area: "+p1.calculateArea());
        System.out.println("Perimeter: "+p1.calculatePerimeter());

        Rectangle r1 = new Rectangle(6,6,"Blue");
        System.out.println("Rectangle:");
        System.out.println("Color: "+r1.getColor());
        System.out.println("Area: "+r1.calculateArea());
        System.out.println("Perimeter: "+r1.calculatePerimeter()+"\n");


    }
}