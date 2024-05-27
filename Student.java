import java.util.Scanner;

public class Student {
    int id;
    int marks;
    String name;
    Scanner scanner;

    Student() {
        id = 0;
        marks = 0;
        name = "No Name";
        scanner = new Scanner(System.in);
    }

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        scanner = new Scanner(System.in);
    }

    void read() {
        System.out.println("Enter the student's ID: ");
        id = scanner.nextInt();
        System.out.println("Enter the student's name: ");
        name = scanner.next();
        System.out.println("Enter the student's marks: ");
        marks = scanner.nextInt();
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    int getMarks() {
        return marks;
    }
}
