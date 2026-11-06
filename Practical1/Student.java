class StudentDetails {
    int rollNo;
    String name;
    int English, Maths, Science;

    // Constructor Function
    StudentDetails(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.English = marks1;
        this.Maths = marks2;
        this.Science = marks3;
    }

    // Calcualtion of total marks
    int calculateTotal() {
        return English + Maths + Science;
    }

    // percentage
    double calculatePercentage() {
        double percentage = calculateTotal() / 3.0;
        return Math.round(percentage * 100.0) / 100.0;
    }

    // Displaying details 
    
    void displayDetails() {
        System.out.println("Roll no.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("-------------------------");
    }
}

public class Student {
    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails(101, "Aadvik Sharma", 85, 90, 78);
        StudentDetails s2 = new StudentDetails(102, "Madhav Bhatia", 76, 82, 88);
        StudentDetails s3 = new StudentDetails(103, "Mann prajapat", 92, 89, 95);
        StudentDetails s4 = new StudentDetails(104, "krishna Raghav", 87, 88, 85);
        StudentDetails s5 = new StudentDetails(105, "Harsh Baisla", 83, 87, 75);
        

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
        s5.displayDetails();
    }
}
