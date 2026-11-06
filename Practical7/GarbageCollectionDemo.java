
class DemoObject {

    DemoObject() {
        System.out.println("Object is created");
    }

    void display() {
        System.out.println("Object is being used");
    }

}

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        // Creating and using an object in a limited scope
        {
            DemoObject obj = new DemoObject();
            obj.display();
        }

        System.out.println("Object reference removed");

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage collection requested");
    }
}
