import  java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = sc.nextLine();
        sc.close();
        char[] s = str.toCharArray();
        int st = 0, e = str.length() - 1;
        while (st < e){
            char temp = s[st];
            s[st] = s[e];
            s[e] = temp;
            st++;
            e--;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(s[i]);
        }
        System.out.println();
    }
}
