package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    StringUtils st;

    @BeforeEach
    public void setUp(){
        st = new StringUtils();
    }

    @Test
    public void testIsPalindrome(){
        boolean result = st.isPalindrome("otto");
        assertTrue(result);
    }

    @Test
    public void testIsPalindromeWithInvalidWord(){
        boolean result = st.isPalindrome("Developer");
        assertFalse(result);
    }
}
