/*
28. Online Shopping Cart System
Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and
apply discounts.
Problem Statement:
● Class Product → instance variables: productId, name, price (Encapsulation: use private variables
with getters/setters)
● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic
behavior for cart items)
● Class Cart extends CartItem → store list of products, implement calculateTotalPrice()
● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can
have discounts applied)
In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost
*/
import java.util.ArrayList;
import java.util.List;
class Product implements Discountable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
      this.productId = productId;
      this.name = name;
      this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setProductId(int productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
	
    @Override
    public void applyDiscount(double percentage) {
      if (percentage > 0 && percentage <= 100) {
          price = price - (price * percentage / 100);
        }
    }
}

abstract class CartItem {
    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
}

class Cart extends CartItem {
    private List<Product> products;

    public Cart() {
       products = new ArrayList<>();
    }

    public void addProduct(Product product) {
       products.add(product);
    }

    @Override
    public double calculateTotalPrice() {
      double total = 0;
      for (Product p : products) {
          total += p.getPrice();
      }
      return total;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
      Cart cart = new Cart();
      Product p1 = new Product(1, "Laptop", 50000);
      Product p2 = new Product(2, "Mouse", 500);
      Product p3 = new Product(3, "Keyboard", 1200);

      cart.addProduct(p1);
      cart.addProduct(p2);
      cart.addProduct(p3);

      System.out.println("Applying 10% discount to " + p1.getName());
      p1.applyDiscount(10);
      System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac ShoppingCartSystem.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java ShoppingCartSystem
Applying 10% discount to Laptop
Total Cart Price = 46700.0
*/