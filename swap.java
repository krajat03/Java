import java.util.Scanner;
public class swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("*Before swapping: \n a = " + a + ", b = " +b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("*After swapping: \n a = " + a + ", b = " +b);
        sc.close();
    }
}