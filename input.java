import java.util.Scanner;
public class input {
    public static void main(String args[]){
        System.out.print("Enter your name: ");
        Scanner tt = new Scanner(System.in);
        String name = tt.nextLine();
        System.out.println("Name: " +name);
        tt.close();
    }
}