
class Employee {
    String name;
    double salary;

    // Static variable
    static int count = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        count++;
    }

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------");
    }

    // Static method
    static void showCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Aadvik", 25000);

        Employee e3 = new Employee("Mann", 30000);

        System.out.println("Employee Details:");

        e1.display();
        e2.display();
        e3.display();

        Employee.showCount();
    }
}
