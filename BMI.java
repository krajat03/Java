import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (in m): ");
        double height = scanner.nextDouble();
        scanner.close();

        double BMI = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", BMI);

        if (BMI < 18.5) {
            System.out.println("-> Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("-> Normal weight");
        } else if (BMI >= 25) {
            System.out.println("-> Over weight");
        }
    }
}