
class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}

public class BookDemo {
    public static void main(String[] args) {

        // Default constructor
        Book b1 = new Book();

        // Parameterized constructor
        Book b2 = new Book("Java Basics", "James", 450);

        // Copy constructor
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        // Modify copied object
        b3.price = 600;

        System.out.println("After modifying copied object:");

        System.out.println("Original Book:");
        b2.display();

        System.out.println("Copied Book:");
        b3.display();
    }
}
