import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int evenSum = 0, oddSum = 0;
        int position = 1; 
        while (number > 0) {
            int digit = number % 10;
            if (position % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
            position++;
        }

        System.out.println("Sum of digits at even places: " + evenSum);
        System.out.println("Sum of digits at odd places: " + oddSum);

        scanner.close();
    }
}
