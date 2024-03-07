import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeriesChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a series of numbers. Terminate with -1:");

        int prevNumber = Integer.MIN_VALUE;
        // int prevNumber = 0;
        int currentNumber;

        while (true) {
            currentNumber = Integer.parseInt(reader.readLine());
            if (currentNumber == -1) {
                System.out.println("Terminate!!");
                break;
            }

            if (currentNumber <= prevNumber) {
                System.out.println("The series is not in increasing order.");
                return;
            }

            prevNumber = currentNumber;

        }
        System.out.println("The series is in increasing order.");

    }
}
