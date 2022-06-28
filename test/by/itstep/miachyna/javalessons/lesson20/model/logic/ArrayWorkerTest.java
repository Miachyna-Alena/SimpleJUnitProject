package by.itstep.miachyna.javalessons.lesson20.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayWorkerTest {

    @Test
    public void testCountNegativeValuePositive() {
        int[] array = {1, -2, 3, -4, 5, -6};
        int expected = 3;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithAllNegativeElements() {
        int[] array = {-1, -2, -3, -4, -5, -6, -8, -9};
        int expected = array.length;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithAllPositiveElements() {
        int[] array = {1, 2, 3, 4, 5};
        int expected = 0;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithEmptyObject() {
        int[] array = {}; // int[] array = new int[0];
        int expected = 0;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithNull() {
        int expected = -1;

        int actual = ArrayWorker.countNegativeValue(null);

        assertEquals(expected, actual);
    }

    @Test
    public void testChangeSign() {
        int[] array = {1, -2, 3, 0, -4, 5};
        int[] expected = {-1, 2, -3, 0, 4, -5};

        ArrayWorker.changeSign(array);

//      for (int i = 0; i < array.length; i++) {
//          if (array[i] != expected[i]) {
//              fail();
//          }
//      }

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithAllPositiveElements() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {-1, -2, -3, -4, -5};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithAllNegativeElements() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] expected = {1, 2, 3, 4, 5};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithOnePositiveElement() {
        int[] array = {1};
        int[] expected = {-1};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithOneNegativeElement() {
        int[] array = {-1};
        int[] expected = {1};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithOneZeroElement() {
        int[] array = {0};
        int[] expected = {0};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test(expected = RuntimeException.class)
    public void testChangeSignWithEmptyObject() {
        int[] array = {}; // int[] array = new int[0];
        ArrayWorker.changeSign(array);
    }

    @Test(expected = RuntimeException.class)
    public void testChangeSignWithNull() {
        ArrayWorker.changeSign(null);
    }
}
