import java.util.*;

public class Check {
    public static void main(String[] args) {
        int sum = 0;
        int avg;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        n = scanner.nextInt();

        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].read();
        }
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
        for (int i = 0; i < n; i++) {
            sum += s[i].marks;
        }
        avg = sum / n;
        System.out.println("The average marks of the students are: " + avg);
         
        scanner.close();
    }
}
