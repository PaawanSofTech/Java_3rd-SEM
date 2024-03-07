import java.io.*;

public class PrimeNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the value of n: ");
        int n = Integer.parseInt(reader.readLine());

        System.out.print("The first " + n + " prime numbers are: ");
        for (int i = 2, count = 0; count < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        reader.close();
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
}