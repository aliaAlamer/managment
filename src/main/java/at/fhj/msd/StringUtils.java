package at.fhj.msd;

public class StringUtils {

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input == reversed;
    }
}
