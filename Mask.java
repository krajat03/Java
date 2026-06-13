public class Mask {

    public static void main(String[] args) {
        String s1 = "abcd", s2 = "cdab";

        char[] ch1 = s1.toCharArray();
        for (int i = 0; i < 2; i+=2) {

            char temp = ch1[i];
            ch1[i + 2] = ch1[i];
            ch1[i] = temp;

            String mask = new String(ch1);

            System.out.println(mask);
        }
    }
}