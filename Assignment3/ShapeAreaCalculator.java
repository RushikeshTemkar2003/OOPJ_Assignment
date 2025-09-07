/*
27. Shape Area Calculator
Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and
Square.
Problem Statement:
● Interface Shape → method calculateArea()
● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation
● In main(), create objects of each shape, input dimensions, display calculated area
*/
import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
      this.radius = radius;
    }

    @Override
    public double calculateArea() {
      return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
      this.length = length;
      this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
       return length * breadth;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
       this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter radius of Circle: ");
      double radius = sc.nextDouble();
      Shape circle = new Circle(radius);
      System.out.println("Circle Area = " + circle.calculateArea());     
      System.out.print("Enter length of Rectangle: ");
      double length = sc.nextDouble();
      System.out.print("Enter breadth of Rectangle: ");
      double breadth = sc.nextDouble();
      Shape rectangle = new Rectangle(length, breadth);
      System.out.println("Rectangle Area = " + rectangle.calculateArea());
      System.out.print("Enter side of Square: ");
      double side = sc.nextDouble();
      Shape square = new Square(side);
      System.out.println("Square Area = " + square.calculateArea());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac ShapeAreaCalculator.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java ShapeAreaCalculator
Enter radius of Circle: 12
Circle Area = 452.15999999999997
Enter length of Rectangle: 2
Enter breadth of Rectangle: 5
Rectangle Area = 10.0
Enter side of Square: 2
Square Area = 4.0
*/