import java.util.Scanner;
public class First_LastOccurrence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        char[] s = str.toCharArray();
        System.out.print("Enter target char: ");
        char key = scanner.next().charAt(0);
        scanner.close();

        int size = str.length();
        int first = firstOccurrence(s, size, key);
        if (first == -1){
            System.out.print("-> Target character is not found!");
            return;
        }
        int last = lastOccurrence(s, size, key);
        System.out.println("-> First Occurrence of " + key + " is at index : " + first);
        System.out.println("-> Last Occurrence of " + key + " is at index : " + last);

    }
    public static int firstOccurrence(char[] s, int size, char key){
        for (int i = 0; i < size; i++) {
            if (s[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int lastOccurrence(char[] s, int size, char key){
        for (int i = size - 1; i >= 0; i--) {
            if (s[i] == key){
                return i;
            }
        }
        return -1;
    }
}
