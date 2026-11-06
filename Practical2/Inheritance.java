class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is running!");
    }
}

// Multilevel Inheritance uses extends keyword to create different levels of inheritance.
class Person {
    void showPerson() {
        System.out.println("This is a person");
    }
}
class Employee extends Person {
    void showEmployee() {
        System.out.println("This is an employee");
    }
}
class Manager extends Employee {
    void showManager() {
        System.out.println("This is a manager");
    }
}

// Hierarchical Inheritance uses extends keyword to create multiple child classes from a single parent class.
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}
class Circle extends Shape {
    void areaOfCircle(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Inheritance{
    public static void main(String[] args) {

        // Single Inheritance used extends keyword to inherit the properties of parent class to child class
        System.out.println("Single Inheritance:");
        Car car = new Car();
        car.start();
        car.drive();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        Manager manager = new Manager();
        manager.showPerson();
        manager.showEmployee();
        manager.showManager();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Circle circle = new Circle();
        circle.display();
        circle.areaOfCircle(5);

        Rectangle rectangle = new Rectangle();
        rectangle.display();
        rectangle.areaOfRectangle(4, 6);
    }
}

