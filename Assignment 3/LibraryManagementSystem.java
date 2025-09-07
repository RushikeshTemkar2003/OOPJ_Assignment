/*
30. Library Management System
Scenario: Manage books and library members with borrowing functionality.
Problem Statement:
● Class Book → private variables: bookId, title, author (Encapsulation)
● Abstract Class LibraryMember → instance variables: memberId, name
○ Abstract method borrowBook(Book book)
● Class StudentMember extends LibraryMember → limit 3 books
● Class FacultyMember extends LibraryMember → limit 5 books
● Interface Notifyable → method sendNotification(String message) → notify members about
overdue books
● In main(), create 1 student and 1 faculty, borrow books, send notifications
*/
import java.util.ArrayList;
import java.util.List;

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
      this.bookId = bookId;
      this.title = title;
      this.author = author;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}

interface Notifyable {
    void sendNotification(String message);
}

abstract class LibraryMember implements Notifyable {
    protected int memberId;
    protected String name;
    protected List<Book> borrowedBooks;

    public LibraryMember(int memberId, String name) {
      this.memberId = memberId;
      this.name = name;
      borrowedBooks = new ArrayList<>();
    }

    public abstract void borrowBook(Book book);

    public int getBorrowedBooksCount() {
       return borrowedBooks.size();
    }
}

class StudentMember extends LibraryMember {
    private final int MAX_BOOKS = 3;

    public StudentMember(int memberId, String name) {
       super(memberId, name);
    }

    @Override
    public void borrowBook(Book book) {
      if (borrowedBooks.size() < MAX_BOOKS) {
          borrowedBooks.add(book);
      } else {
          System.out.println(name + " cannot borrow more than " + MAX_BOOKS + " books.");
      
}	  }

    @Override
    public void sendNotification(String message) {
      System.out.println("Notification sent to " + name + ": " + message);
    }
}


class FacultyMember extends LibraryMember {
    private final int MAX_BOOKS = 5;

    public FacultyMember(int memberId, String name) {
      super(memberId, name);
    }

    @Override
    public void borrowBook(Book book) {
      if (borrowedBooks.size() < MAX_BOOKS) {
          borrowedBooks.add(book);
      } else {
          System.out.println(name + " cannot borrow more than " + MAX_BOOKS + " books.");
      }
    }

    @Override
    public void sendNotification(String message) {
       System.out.println("Notification sent to " + name + ": " + message);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
      
      Book book1 = new Book(1, "Java Programming", "Author A");
      Book book2 = new Book(2, "Data Structures", "Author B");
      Book book3 = new Book(3, "Operating Systems", "Author C");
      Book book4 = new Book(4, "Database Systems", "Author D");
      Book book5 = new Book(5, "Computer Networks", "Author E");
	  
      StudentMember student = new StudentMember(101, "Amit");
      FacultyMember faculty = new FacultyMember(201, "Prof. Singh");

      student.borrowBook(book1);
      student.borrowBook(book2);

      faculty.borrowBook(book1);
      faculty.borrowBook(book2);
      faculty.borrowBook(book3);
      faculty.borrowBook(book4);

      System.out.println("StudentMember " + student.name + " borrowed " + student.getBorrowedBooksCount() + " books");
      System.out.println("FacultyMember " + faculty.name + " borrowed " + faculty.getBorrowedBooksCount() + " books");

      student.sendNotification("Return books within 7 days");
      faculty.sendNotification("Return books within 14 days");
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>javac LibraryManagementSystem.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment3>java LibraryManagementSystem
StudentMember Amit borrowed 2 books
FacultyMember Prof. Singh borrowed 4 books
Notification sent to Amit: Return books within 7 days
Notification sent to Prof. Singh: Return books within 14 days
*/
