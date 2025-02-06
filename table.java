import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
        s.close();
    }
}