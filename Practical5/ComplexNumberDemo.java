
class ComplexNumber {
    int real;
    int imaginary;

    // Constructor Function
    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // adding 
    ComplexNumber add(ComplexNumber num) {
        int r = this.real + num.real;
        int i = this.imaginary + num.imaginary;

        return new ComplexNumber(r, i);
    }

    // Displaying the number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.println("Sum of Complex Numbers:");
        result.display();
    }
}
