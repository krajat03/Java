import java.util.Scanner;
public class voting {
    public static void main(String args[]){
        System.out.print("Enter Your age: ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        s.close();
        if (age >= 18) {
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible for voting");
        }
    }
    
}