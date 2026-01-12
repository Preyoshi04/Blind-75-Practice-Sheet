import java.util.*;

public class Valid_Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        Valid_Palindrome obj = new Valid_Palindrome();
        System.out.println(obj.isPalindrome(str));
        sc.close();
    }
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char currChar = s.charAt(start);
            char lastChar = s.charAt(end);
            if (!Character.isLetterOrDigit(currChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(lastChar)) {
                end--;
            } else {
                if (Character.toLowerCase(currChar) != Character.toLowerCase(lastChar)) {
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}