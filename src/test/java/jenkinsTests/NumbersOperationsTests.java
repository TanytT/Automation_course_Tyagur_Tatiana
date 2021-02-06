package jenkinsTests;

import com.company.homeworks.HW32.NumbersOperations;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumbersOperationsTests {

    private NumbersOperations numbersOperations = new NumbersOperations();

    @Test
    @Step("Check if number is prime")
    public void isPrimeNumbPositiveTest(){
        assertTrue(numbersOperations.isPrimeNumb(37),"The number is not prime");
    }
    @Test
    @Step("Check if number is not prime")
    public void isPrimeNumbNegativeTest(){
        assertFalse(numbersOperations.isPrimeNumb(24),"The number is prime");
    }
    @Test
    @Step("Find second maw value in array ")
    public void secondMaxValuePositiveTest(){
        int [] arr = {5,1,9,9,3,5,100,2};
        assertEquals(numbersOperations.secondMaxValue(arr),9);
    }

}
