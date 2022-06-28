package by.itstep.miachyna.javalessons.lesson20.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

//  Rule AAA!!!

    @Test
    public void testSum() {
//      Arrange
        int a = 11;
        int b = 3;
        int expected = 14;

//      Act
        int actual = Calculator.sum(a, b);

//      Assert

//      if (expected != actual) {
//          Assert.fail();
//      }

        assertEquals(expected, actual);
    }

    @Test
    public void testSub() {

        int a = 11;
        int b = 3;
        int expected = 8;

        int actual = Calculator.sub(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void testMul() {

        int a = 11;
        int b = 3;
        int expected = 33;

        int actual = Calculator.mul(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void testDiv() {

        int a = 11;
        int b = 3;
        int expected = 3;

        int actual = Calculator.div(a, b);

        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {

        int a = 11;
        int b = 0;

        Calculator.div(a, b);
    }
}
