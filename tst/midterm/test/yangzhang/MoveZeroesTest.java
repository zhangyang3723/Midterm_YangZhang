package midterm.test.yangzhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import midterm.yangzhang.MoveZeroes;

public class MoveZeroesTest {

    private MoveZeroes test;

    @Before
    public void init() {
        test = new MoveZeroes();
    }

    @Test
    public void testTwo() {
        int[] a = {0, 1};
        int[] b = {1, 0};
        Assert.assertArrayEquals(test.moveZeroes(a), b);
    }

    @Test
    public void testMultiple() {
        int[] a = {0, 1, 12, 3, 0, 4};
        int[] b = {1, 12, 3, 4, 0, 0};
        Assert.assertArrayEquals(test.moveZeroes(a), b);
    }

    @Test
    public void testAllZeros() {
        int[] a = {0, 0, 0};
        int[] b = {0, 0, 0};
        Assert.assertArrayEquals(test.moveZeroes(a), b);
    }

    @Test
    public void testAllNonZeros() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        Assert.assertArrayEquals(test.moveZeroes(a), b);
    }

    @Test
    public void testEmptyArray() {
        int[] a = {};
        int[] b = {};
        Assert.assertArrayEquals(test.moveZeroes(a), b);
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        int[] a = null;
        int[] b = null;
        Assert.assertArrayEquals(test.moveZeroes(a), b);
    }

}
