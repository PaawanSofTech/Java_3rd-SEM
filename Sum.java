import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n = Integer.parseInt(reader.readLine());
        int evenSum = 0, oddSum = 0;
        int count = 0;
        int num = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        for (int i = 0; i <= count; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + num % 10;
                num = num / 10;
            } else {
                oddSum = oddSum + num % 10;
                num = num / 10;
            }
        }
        System.out.println("Sum of digits at even places: " + evenSum);
        System.out.println("Sum of digits at odd places: " + oddSum);
    }
}
