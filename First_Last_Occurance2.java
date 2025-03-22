import java.util.Scanner;
public class First_Last_Occurance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("-> Enter element: ");
            arr[i] = scanner.nextInt();
        }
    
        System.out.print("\n-> Enter target number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.print("\nElements are: \n-> ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n=> First occurance of " + num + " is at: " + firstOccurance(arr, size, num));
        System.out.println("=> Last occurance of " + num + " is at: " + lastOccurance(arr, size, num));
    }
    public static int firstOccurance(int[] arr, int size, int num){
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static int lastOccurance(int[] arr, int size, int num){
        for (int i = size-1 ; i >= 0; i--) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}