package sef.FinalTasks.Calctest;

import junit.framework.TestCase;
import org.junit.Test;

public class Calculatortest extends TestCase{

    public Calculator theCalculator;

    public void setUp() throws Exception {
        super.setUp();
        theCalculator = new Calculator();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }


    @Test
    public void testGetsum () {
        assertEquals(111, theCalculator.sum(100, 11));
        assertEquals(-111, theCalculator.sum(0, -111));
        assertEquals(0, theCalculator.sum(0, 0));
    }

    @Test
    public void testGetsub () {
        assertEquals(111, theCalculator.sub(122, 11));
        assertEquals(222, theCalculator.sub(111, -111));
        assertEquals(0, theCalculator.sum(0, 0));
    }

    @Test
    public void testGetmultiply () {
        assertEquals(121, theCalculator.multiply(11, 11));
        assertEquals(121, theCalculator.multiply(-11, -11));
        assertEquals(-121, theCalculator.multiply(11, -11));
        assertEquals(0, theCalculator.multiply(11, 0));
    }

    @Test
    public void testGetdivide () {
        assertEquals(11, theCalculator.divide(121, 11));
        assertEquals(-11, theCalculator.divide(121, -11));
        try {
            theCalculator.divide(111, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            assertEquals("We dont devide by 0 didnt you know that ?", e.getMessage());
        }
    }
}