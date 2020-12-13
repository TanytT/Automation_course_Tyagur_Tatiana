import com.company.homeworks.HW18.StringFunctions;
import org.testng.annotations.Test;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

import static org.testng.Assert.*;

public class StringFunctionsTest {

    StringFunctions strFun = new StringFunctions();

    @Test(priority = 1)
    public void test1Concat(){
        assertEquals(strFun.concatenate("Hello ", "world","!!!"), "Hello world!!!");
    }

    @Test(priority = 2)
    public void test2Concat() {
        assertNotSame(strFun.concatenate("Hello ", "world","!!!"), "Hello world!!!");
    }

    @Test(priority = 3)
    public void test1IsContain(){
        assertTrue(strFun.isContain("Hello world 123","2"));
    }

    @Test
    public void test2IsContain() {
        assertFalse(strFun.isContain("Hello world 123","hi"));
    }

    @Test
    public void test1StrToArr(){
        assertArrayEquals(strFun.strToArr("Hello world"),new char[]{'H','e','l','l','o',' ','w','o','r','l','d'});
    }

    @Test
    public void testStrToStrArr(){
        assertEqualsNoOrder(strFun.strToStrArr("Hello world !!!"),new String[]{"!!!", "Hello", "world"});
    }

    @Test
    public void testFuncIsNull(){
        assertNull(strFun.funcIfNull(null));
    }


}
