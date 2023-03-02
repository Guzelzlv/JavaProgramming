package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, diameter, area, perimeter
      double PI=3.13;
      double radius=3.5;
      double diameter=radius*2; //finding diameter by multiplying radius top 2
      double area=radius * radius * PI;
      double perimeter = diameter * PI;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
/**
 Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
 PI, radius, diameter, area, perimeter

 Hints: 	PI = 3.14
 area = radius * radius * PI
 Perimeter = diameter * PI

 */