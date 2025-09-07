/*
13. Shape Drawing
Scenario: A graphics program needs to draw different shapes.
Problem Statement:
Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement
draw().
Classes/Fields:
● Shape → draw() (abstract)
● Circle → radius
● Rectangle → length, breadth
*/
abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
      this.radius = radius;
    }

    @Override
    public void draw() {
      System.out.println("Drawing Circle of radius " + radius);
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
      this.length = length;
      this.breadth = breadth;
    }

    @Override
    public void draw() {
      System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

public class ShapeDrawing {
    public static void main(String[] args) {
      Circle circle = new Circle(7);
      Rectangle rectangle = new Rectangle(5, 10);

      circle.draw();
      rectangle.draw();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac ShapeDrawing.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java ShapeDrawing
Drawing Circle of radius 7
Drawing Rectangle of length 5 and breadth 10
*/