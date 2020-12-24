package testNgUnitTests;

import com.company.homeworks.HW18.Pet;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PetTest {

    Pet cat = new Pet("Lesya", "cat", 2, 2.3);
    Pet dog = new Pet("Boy", "dog", 6, 5.8);
    Pet[] pets = new Pet[]{cat, dog};


    @Test
    public void testSetWeight(){
        assertSame(cat.setWeight(cat,3.0),cat);
    }

    @Test
    public void test1WhoYounger(){
        assertNotSame(cat.whoYounger(cat,dog),dog);
    }

    @Test
    public void test3WhoYounger(){
        assertNull(cat.whoYounger(cat,null),null);
    }

    @Parameters()
            //{"name"})
    @Test
    public void testHasName(){
            //String name){
        assertTrue(cat.hasName(pets, "Lesya"));
    }

    @Test(timeOut = 2000)
    public void test2HasName(){
        assertFalse(cat.hasName(pets, "Bobic"));
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testNullPointerException() {
        Pet parrot = null;
        Double size = parrot.getWeight();
    }

}
