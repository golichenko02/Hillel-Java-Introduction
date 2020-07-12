package strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "9239329";
        String s1 = "12321";
        String s2 = "123456";
        System.out.println(isPalindrome(s)); // true
        System.out.println(isPalindrome(s1)); // true
        System.out.println(isPalindrome(s2)); // false


    }
    public static boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}
