import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double p = s.nextDouble();
        System.out.print("Enter Rate (% per annum): ");
        double r = s.nextDouble();
        System.out.print("Enter Time (in years): ");
        double t = s.nextDouble();
        s.close();
        // Fromula of simple interest 
        double SimpleInterest = (p * r * t) / 100;
        // Calculating amount should be paid
        double amount = p + SimpleInterest;
        System.out.printf("Simple Interest: %.2f%n", SimpleInterest);
        System.out.printf("Total amount per annum: %.2f%n", amount);
    }
}