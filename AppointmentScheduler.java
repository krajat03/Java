import java.util.Scanner;

public class AppointmentScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int appointmentNumber = 0;
        
        while (true) {
            // DETAILS OF PATIENT
            System.out.println("\t** DETAILS OF PATIENT ** ");
            System.out.print("-> Fullname: ");
            String fullName = scanner.nextLine();
            
            System.out.print("-> Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println();
            
            // DETAILS OF FATHER
            System.out.println("\t** DETAILS OF FATHER ** ");
            System.out.print("-> Fullname: ");
            String fatherName = scanner.nextLine();
            System.out.print("-> Contact Number: ");
            long fatherContact = scanner.nextLong();
            scanner.nextLine(); // Consume newline
            System.out.println();
            
            // DETAILS OF MOTHER
            System.out.println("\t** DETAILS OF MOTHER ** ");
            System.out.print("-> Fullname: ");
            String motherName = scanner.nextLine();
            System.out.print("-> Contact Number: ");
            long motherContact = scanner.nextLong();
            scanner.nextLine(); // Consume newline
            System.out.println();
            
            // APPOINTMENT TIME
            System.out.println("\t** APPOINTMENT TIME ** ");
            System.out.print("-> Enter appointment time (e.g., 10:30 AM): ");
            String appointmentTime = scanner.nextLine();
            System.out.println();
            
            appointmentNumber++;
            
            // FINAL FORM
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("                     ***** APPOINTMENT DETAILS *****");
            System.out.println("# Appointment Number: " + appointmentNumber);
            System.out.println("  Patient's Name: " + fullName);
            System.out.println("  Patient's Age: " + age);
            System.out.println("  Father's Name: " + fatherName + "          Contact No.: " + fatherContact);
            System.out.println("  Mother's Name: " + motherName + "          Contact No.: " + motherContact);
            System.out.println("\n  Appointment Time: " + appointmentTime);
            System.out.println("----------------------------------------------------------------------------");

            System.out.print("Do you want to schedule another appointment? (y/n): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("n")) {
                System.out.println("Exiting the scheduler. Have a nice day!");
                break;
            }
        }
        
        scanner.close(); 
    }
}
