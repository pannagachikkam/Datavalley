import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter a number (enter 0 to finish): ");
            int number = scanner.nextInt();

            if (number == 0) {
                continueInput = false;
            } else {
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
                sum += number;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double average = (double) sum / count;

            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Largest number entered: " + largest);
            System.out.println("Average of all numbers entered: " + average);
        }

        scanner.close();
    }
}
