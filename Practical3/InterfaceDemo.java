
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple Inheritance using interfaces
class AllInOnePrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Hybrid Inheritance
class Machine {
    void start() {
        System.out.println("Machine is starting");
    }
}

interface Rechargeable {
    void charge();
}

class SmartPrinter extends Machine implements Printable, Rechargeable {

    @Override
    public void print() {
        System.out.println("Smart printer is printing");
    }

    @Override
    public void charge() {
        System.out.println("Smart printer is charging");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        // Multiple Inheritance
        System.out.println("Multiple Inheritance:");
        AllInOnePrinter printer = new AllInOnePrinter();

        printer.print();
        printer.scan();

        // Hybrid Inheritance
        System.out.println("\nHybrid Inheritance:");
        SmartPrinter smartPrinter = new SmartPrinter();

        smartPrinter.start();
        smartPrinter.print();
        smartPrinter.charge();
    }
}
