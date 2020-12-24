package testNgUnitTests;

import com.company.homeworks.HW18.Stack;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class StackTest {

    Stack stack = new Stack(5);

    @BeforeClass
    public void testBeforeClass(){

        stack.addElem(0);
        stack.addElem(15);
        stack.addElem(28);
        stack.addElem(32);
    }

    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("Before method");
    }

    @AfterMethod
    public void testAfterMethod(){
        System.out.println("After method");
    }

    @AfterClass
    public void testAfterClass(){

        stack.deleteElem();
        stack.deleteElem();
        stack.deleteElem();
        stack.deleteElem();
    }

    @Test(timeOut = 2000)
    public void testIsEmpty(){
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsFull(){
        assertFalse(stack.isFull());
    }


    @Test(dependsOnMethods = {"testIsEmpty"})
    public void testAddElem(){
        assertTrue(stack.addElem(66));
    }

    @Test(dependsOnMethods = {"testAddElem"})
    public void testRead(){
        assertEquals(stack.read(),66);
    }

    @Test(dependsOnMethods = {"testRead"})
    public void testDeleteElem(){
        assertEquals(stack.deleteElem(),66);

    }

}
