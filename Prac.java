import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter numbers: ");

        int sum = 0;
        int count = 0;

        while (true) {
            int n = Integer.parseInt(reader.readLine());

            if (n == -1) {
                break;
            }

            count++;
            sum += n;
        }

        if (count != 0) {
            int avg = sum / count;
            System.out.println("Average: " + avg);
        } else {
            System.out.println("No numbers entered. Cannot calculate average.");
        }
    }
}
