import java.util.Scanner;

public class task4 {

    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        if (isPalindrome(s, 0, s.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}