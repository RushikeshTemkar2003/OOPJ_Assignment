/*
4. Library Book Availability
Scenario: A library wants to keep track of available copies without letting external code change it
directly.
Problem Statement:
Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies.
Fields:
● private int copiesAvailable
Methods:
● addCopies(int n) → add copies
● removeCopies(int n) → subtract if enough copies
● getCopiesAvailable() → return current copies
*/
class Book {
    private int copiesAvailable;

    public void addCopies(int n) {
       if (n > 0) {
           copiesAvailable = copiesAvailable + n;
       }
    }

    public void removeCopies(int n) {
       if (n > 0 && n <= copiesAvailable) {
           copiesAvailable = copiesAvailable - n;
       } else {
           System.out.println("Not enough copies to remove");
       }
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}

public class LibraryBookAvailability {
    public static void main(String[] args) {
      Book book = new Book();
      book.addCopies(3);
      book.removeCopies(1);
      System.out.println("Copies available = " + book.getCopiesAvailable());
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac LibraryBookAvailability.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java LibraryBookAvailability
Copies available = 2
*/