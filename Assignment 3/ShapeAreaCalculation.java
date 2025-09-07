/*
6. Shape Area Calculation
Scenario: You are designing a program to calculate areas of different shapes.
Problem Statement:
Create a superclass Shape with a method area(). Derive two subclasses Rectangle and Circle. Implement
area() in each subclass.
Classes/Fields:
● Shape → area() (method stub)
● Rectangle → length, breadth
● Circle → radius
Methods:
● Rectangle.area() → length × breadth
● Circle.area() → π × radius²
*/

abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
       this.radius = radius;
    }

    public double area() {
       return Math.PI * radius * radius;
    }
}

public class ShapeAreaCalculation {
    public static void main(String[] args) {
      Rectangle rect = new Rectangle(5, 10);
      Circle circle = new Circle(7);

      System.out.println("Rectangle Area = " + rect.area());
      System.out.println("Circle Area = " + String.format("%.2f", circle.area()));
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac ShapeAreaCalculation.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java ShapeAreaCalculation
Rectangle Area = 50.0
Circle Area = 153.94
*/