package at.fhj.msd;

/**
 * the StringUtils class has a method that checks if a word is written in a reserved it would still be the same and if so the method returns true
 */
public class StringUtils {

    /**
     * the method checks if the word is still correct even when its written in the other way around (reversed)
     * @param input the word that needs to be checked
     * @return true if the word is still correct when reversed
     */
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
