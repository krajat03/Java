import java.util.Scanner;

public class DeciBinaryPartitionNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> Enter a number: ");
        String num = scanner.nextLine();

        scanner.close();

        int ans = minPartition(num);
        System.out.println("-> Minimun Deci-Binary required number is: " + ans);
    }

    static int minPartition(String num) {
        int max = 0;
        for (char c : num.toCharArray()) {
            max = Math.max(max, c - '0');
        }
        return max;
    }
}
