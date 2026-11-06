
class Product {
    String productName;
    double price;
    int quantity;

    // Constructor 1: No arguments
    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // Constructor 2: Product name only
    Product(String productName) {
        this.productName = productName;
        price = 0.0;
        quantity = 0;
    }

    // Constructor 3: Product name and price
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        quantity = 1;
    }

    // Constructor 4: All three values
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total cost
    double calculateTotal() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
        System.out.println("----------------------");
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1200, 2);

        System.out.println("Product 1:");
        p1.display();

        System.out.println("Product 2:");
        p2.display();

        System.out.println("Product 3:");
        p3.display();

        System.out.println("Product 4:");
        p4.display();
    }
}
