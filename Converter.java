import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n------------------------------------");
            System.out
                    .print("1) Length \n2) Temperature \n3) Currency \n4) Speed \n5) Mass \n6) Exit\n-> Select option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    lengthConverter(scanner);
                    break;
                case 2:
                    temperatureConverter(scanner);
                    break;
                case 3:
                    currencyConverter(scanner);
                    break;
                case 4:
                    speedConverter(scanner);
                    break;
                case 5:
                    massConverter(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("$$ Invalid choice! Please select a valid option. $$");
            }
        }
    }

    public static void lengthConverter(Scanner scanner) {
        System.out.print("-> Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("1) Meter to Feet \n2) Feet to Meter \n3) Meter to Yard \n4) Yard to Meter \nEnter choice: ");
        int choice = scanner.nextInt();
        double meter, feet, yard;

        switch (choice) {
            case 1:
                System.out.println("$$ Meter to Feet $$");
                feet = length * 3.2808;
                System.out.printf("-> %.3f m = %.3f ft%n", length, feet);
                break;
            case 2:
                System.out.println("$$ Feet to Meter $$");
                meter = length * 0.3048;
                System.out.printf("-> %.3f ft = %.3f m%n", length, meter);
                break;
            case 3:
                System.out.println("$$ Meter to Yard $$");
                yard = length * 1.0936;
                System.out.printf("-> %.3f m = %.3f yd%n", length, yard);
                break;
            case 4:
                System.out.println("$$ Yard to Meter $$");
                meter = length * 0.9144;
                System.out.printf("-> %.3f yd = %.3f m%n", length, meter);
                break;
            default:
                System.out.println("$$ Invalid choice! Please select a valid option. $$");
        }
    }

    public static void temperatureConverter(Scanner scanner) {
        System.out.print("-> Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("1) C to F / K \n2) F to C / K \n3) K to C / F \nEnter choice: ");
        int choice = scanner.nextInt();

        double c, f, k;

        switch (choice) {
            case 1:
                System.out.println("$$ Celsius to Fahrenheit / Kelvin $$");
                f = (temperature * 9 / 5) + 32;
                k = temperature + 273.15;
                System.out.printf("=> %.3f°C = %.3f°F, %.3f K%n", temperature, f, k);
                break;
            case 2:
                System.out.println("$$ Fahrenheit to Celsius / Kelvin $$");
                c = (temperature - 32) * 5 / 9;
                k = c + 273.15;
                System.out.printf("=> %.3f°F = %.3f°C, %.3f K%n", temperature, c, k);
                break;
            case 3:
                System.out.println("$$ Kelvin to Celsius / Fahrenheit $$");
                c = temperature - 273.15;
                f = (c * 9 / 5) + 32;
                System.out.printf("=> %.3f K = %.3f°C, %.3f°F%n", temperature, c, f);
                break;
            default:
                System.out.println("$$ Invalid choice! Please select a valid option. $$");
        }
    }

    public static void currencyConverter(Scanner scanner) {
        System.out.print("-> Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("1) INR (Rs) to USD ($) \n2) USD ($) to INR (Rs) \nEnter choice: ");
        int option = scanner.nextInt();
        double USD, INR;
        switch (option) {
            case 1:
                System.out.println("*** INR (Rs) to USD ($) ***");
                USD = (amount * 0.011);
                System.out.printf("=> %.2fRs = %.2f$", amount, USD);
                break;
            case 2:
                System.out.println("*** USD ($) to INR (Rs) ***");
                INR = amount * 87.315;
                System.out.printf("=> %.2f$ = %.2fRs", amount, INR);
                break;
            default:
                System.out.println("$$ Invalid choice! Please select a valid option. $$");
        }
    }

    public static void speedConverter(Scanner scanner) {
        System.out.print("-> Enter speed: ");
        double speed = scanner.nextDouble();
        System.out.print("1) km/hr to m/s \n2) m/s to km/hr \nEnter choice: ");
        int option = scanner.nextInt();
        double kmh, ms;
        switch (option) {
            case 1:
                System.out.println("*** km/hr to m/s ($) ***");
                ms = speed * 0.27778;
                System.out.printf("=> %.2f km/hr = %.2f m/s", speed, ms);
                break;
            case 2:
                System.out.println("*** m/s to km/hr ***");
                kmh = speed * 3.6;
                System.out.printf("=> %.2f m/s = %.2f km/hr", speed, kmh);
                break;
            default:
                System.out.println("$$ Invalid choice! Please select a valid option. $$");
        }
    }

    public static void massConverter(Scanner scanner) {
        System.out.print("-> Enter mass: ");
        double mass = scanner.nextDouble();
        System.out.print("1) kg to g/pound(lb) \n2) g to kg/pound(lb) \n3) pound(lb) to g/kg \nEnter choice: ");
        int option = scanner.nextInt();
        Double kg, g, pound;
        switch (option) {
            case 1:
                System.out.println("*** kg to g/pound(lb) ***");
                g = mass * 1000;
                pound = mass * 2.204622;
                System.out.printf("=> %.3f kg = %.3f g, %.3f lb%n", mass, g, pound);
                break;
            case 2:
                System.out.println("*** g to kg/pound(lb) ***");
                kg = mass * 0.001;
                pound = mass * 0.00220462;
                System.out.printf("=> %.3f g = %.3f kg, %.3f lb%n", mass, kg, pound);
                break;
            case 3:
                System.out.println("*** pound(lb) to g/kg ***");
                g = mass * 453.592;
                kg = mass * 0.453592;
                System.out.printf("=> %.3f lb = %.3f g, %.3f kg%n", mass, g, kg);
                break;

            default:
                System.out.println("$$ Invalid choice! Please select a valid option. $$");
        }
    }
}