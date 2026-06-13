import java.util.Scanner;

public class Object_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object arr[] = new Object[5];
        arr[0] = 1;
        arr[1] = "Rajat";
        arr[2] = "Rajat Kumar";
        arr[3] = 'R';
        arr[4] = 'r';
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
