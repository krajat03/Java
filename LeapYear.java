import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            
            if (year % 400 == 0) {
                System.out.printf("-> %d is a leap year.%n", year);
            } else if (year % 100 == 0) {
                System.out.printf("-> %d is not a leap year.%n", year);
            } else if (year % 4 == 0) {
                System.out.printf("-> %d is a leap year.%n", year);
            } else {
                System.out.printf("-> %d is not a leap year.%n", year);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid year.");
        }
        
        scanner.close();
    }
}
