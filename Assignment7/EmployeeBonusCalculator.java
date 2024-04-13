import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year in which the employee joined the organization: ");
        int joinedYear = scanner.nextInt();

        int yearsOfService = currentYear - joinedYear;

        if (yearsOfService > 5) {
            System.out.println("Congratulations! You have served the organization for more than 5 years. You get a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Congratulations! You have served the organization for 3 to 5 years. You get a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, no bonus is awarded for serving less than 3 years.");
        }
        
        scanner.close();
    }
}
