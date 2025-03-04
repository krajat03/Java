import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("-> Enter principal amount: ");
        double p = s.nextDouble();
        System.out.print("-> Enter Rate (%per annum): ");
        double r = s.nextDouble();
        r = r / 100;
        System.out.print("-> Enter compounding freq: ");
        double n = s.nextDouble();
        System.out.print("-> Enter time (in yrs): ");
        double t = s.nextDouble();
        s.close();
        double amount = p * (Math.pow((1 + r / n), (n * t)));
        double compoundInterest = amount - p;
        System.out.printf("* Amount: %.2f%n", amount);
        System.out.printf("* Compound Interest: %.2f%n", compoundInterest);
    }
}