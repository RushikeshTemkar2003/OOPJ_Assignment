/*
15. Shape Area Calculation
Scenario: A program needs to calculate the area of different shapes using the same method name but
different parameters.
Problem Statement:
Create a class ShapeArea with overloaded methods calculateArea().
Methods:
● calculateArea(int side) → calculates area of square
● calculateArea(int length, int breadth) → calculates area of rectangle
● calculateArea(double radius) → calculates area of circle
*/
class ShapeArea {
    public int calculateArea(int side) {
      return side * side; // Square
    }

    public int calculateArea(int length, int breadth) {
      return length * breadth; // Rectangle
    }

    public double calculateArea(double radius) {
      return Math.PI * radius * radius; // Circle
    }
}

public class ShapeAreaCalculation15 {
    public static void main(String[] args) {
      ShapeArea shape = new ShapeArea();

      int squareArea = shape.calculateArea(5);
      int rectangleArea = shape.calculateArea(4, 6);
      double circleArea = shape.calculateArea(3.0);

      System.out.println("Square Area = " + squareArea);
      System.out.println("Rectangle Area = " + rectangleArea);
      System.out.println("Circle Area = " + String.format("%.2f", circleArea));
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac ShapeAreaCalculation15.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java ShapeAreaCalculation15
Square Area = 25
Rectangle Area = 24
Circle Area = 28.27
*/
