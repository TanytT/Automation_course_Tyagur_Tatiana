package jenkinsTests;

import com.company.homeworks.HW32.StringOperations;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringOperationsTests {

    private StringOperations stringOperations = new StringOperations();

    @Test
    public void reverseStringPositiveTest(){
        assertEquals(stringOperations.reverseStr("Hello world!"),"!dlrow olleH");
    }

    @Test
    public void isPalindromePositiveTest(){
        assertTrue(stringOperations.isPalindrome("Ababa baba"),"String is not palindrome");
    }
    @Test
    public void isPalindromeNegativeTest(){
        assertFalse(stringOperations.isPalindrome("Ababa babab"),"String is palindrome");
    }

    @Test
    public void countOfWordsPositiveTest(){
        assertEquals(stringOperations.countOfWords("Hello hello hello world!"),4);
    }
}
