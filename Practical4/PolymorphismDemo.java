
class Calculator {

    // Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adding two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}

// Parent class
class Employee {
    double calculatePay() {
        return 0;
    }
}

// First child class
class FullTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 30000;
    }
}

// Second child class
class PartTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 15000;
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        // Method Overloading
        System.out.println("Method Overloading:");

        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of decimal numbers: " + calc.add(5.5, 4.5));

        // Method Overriding
        System.out.println("\nMethod Overriding:");

        Employee emp;

        emp = new FullTimeEmployee();
        System.out.println("Full Time Employee Pay: " + emp.calculatePay());

        emp = new PartTimeEmployee();
        System.out.println("Part Time Employee Pay: " + emp.calculatePay());
    }
}
