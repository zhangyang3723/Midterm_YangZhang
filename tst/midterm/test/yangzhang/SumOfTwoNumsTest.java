package midterm.test.yangzhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import midterm.yangzhang.SumOfTwoNums;

public class SumOfTwoNumsTest {

    private SumOfTwoNums test;

    @Before
    public void init() {
        test = new SumOfTwoNums();
    }

    @Test
    public void test() {
        int[] a = {2, 7, 11, 15};
        Assert.assertTrue(test.twoSum(a, 9));
        Assert.assertFalse(test.twoSum(a, 10));
        Assert.assertFalse(test.twoSum(a, 200));
        Assert.assertTrue(test.twoSum(a, 17));
    }

    @Test
    public void testEmptyArray() {
        int[] a = {};
        Assert.assertFalse(test.twoSum(a, 9));
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        int[] a = null;
        Assert.assertFalse(test.twoSum(a, 9));
    }

}
