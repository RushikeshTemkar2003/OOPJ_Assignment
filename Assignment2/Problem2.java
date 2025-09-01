/*
Problem 2: Simple Mobile Tracker 
Scenario: A shop wants to count how many mobiles are added to their inventory. 
Requirements: 
1. Create a class Mobile with instance variable: model (String). 
2. Create a static variable totalMobiles to count total mobiles added. 
3. Constructor should initialize model and increment totalMobiles. 
4. Create a getter for model. 
5. Create a static method showTotalMobiles() to print total mobiles. 
*/
class Mobile {
    String model;
    static int totalMobiles = 0;

    public Mobile(String model) {
        this.model = model;
        totalMobiles++;
    }

    public String getModel() {
        return model;
    }

    public static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }
}

public class Problem2 {
    public static void main(String[] args) {
      Mobile m1 = new Mobile("Samsung Galaxy M32");
      Mobile m2 = new Mobile("Redmi Note 12");
      System.out.println("Mobile1 model: " + m1.getModel());
      System.out.println("Mobile2 model: " + m2.getModel());
      Mobile.showTotalMobiles();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem2.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem2
Mobile1 model: Samsung Galaxy M32
Mobile2 model: Redmi Note 12
Total mobiles in stock: 2
*/