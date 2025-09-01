/*
Problem 17: Library Book Addition 
Scenario: 
Create Book class with bookId, title, author. 
● Constructor + Getters/Setters 
● Create Library class with libraryName and static totalBooks 
● Method addBook(Book b) → increments totalBooks 
● Method displayTotalBooks() → prints totalBooks 
● Add 2 books to library and display total books
*/
class Book {
    int bookId;
    String title, author;

    Book(int bookId, String title, String author) {
      this.bookId = bookId;
      this.title = title;
      this.author = author;
    }

    int getBookId() { return bookId; }
    String getTitle() { return title; }
    String getAuthor() { return author; }
}

class Library {
    String libraryName;
    static int totalBooks = 0;

    Library(String libraryName) {
      this.libraryName = libraryName;
    }

    void addBook(Book b) {
       totalBooks++;
       System.out.println("Book Added: " + b.getTitle());
    }

    void displayTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }
}

public class Problem17 {
    public static void main(String[] args) {
      Library lib = new Library("CDAC Library");

      Book b1 = new Book(101, "Java Basics", "James Gosling");
      Book b2 = new Book(102, "Python Guide", "Guido van Rossum");

      lib.addBook(b1);
      lib.addBook(b2);

      lib.displayTotalBooks();
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>javac Problem17.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment2>java Problem17
Book Added: Java Basics
Book Added: Python Guide
Total Books in Library: 2
*/