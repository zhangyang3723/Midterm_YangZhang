package midterm.test.yangzhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import midterm.yangzhang.Anagram;

public class AnagramTest {

    private Anagram test;

    @Before
    public void init() {
        test = new Anagram();
    }

    @Test
    public void testTwoStringsWithDifferentLengths() {
        String a = "abc";
        String b = "ab";
        Assert.assertFalse(test.isAnagram(a, b));
    }

    @Test
    public void testStringsWithOneSameChar() {
        String a = "r";
        String b = "r";
        Assert.assertTrue(test.isAnagram(a, b));
    }

    @Test
    public void testStringsWithOneDifferentChar() {
        String a = "r";
        String b = "b";
        Assert.assertFalse(test.isAnagram(a, b));
    }

    @Test
    public void testTwoStringsWithSameLengthsDifferentChar() {
        String a = "happy";
        String b = "apple";
        Assert.assertFalse(test.isAnagram(a, b));
    }

    @Test
    public void testTwoStringsWithSameLengthsSameChar() {
        String a = "happy";
        String b = "yahpp";
        Assert.assertTrue(test.isAnagram(a, b));
    }

    @Test
    public void testTwoSameStrings() {
        String a = "happy";
        String b = "happy";
        Assert.assertTrue(test.isAnagram(a, b));
    }

    @Test(expected = NullPointerException.class)
    public void testTwoNullStrings() {
        String a = null;
        String b = null;
        Assert.assertTrue(test.isAnagram(a, b));
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        String a = null;
        String b = "happy";
        test.isAnagram(b, a);
    }

    @Test
    public void testEmptyStrings() {
        String a = "";
        String b = "";
        Assert.assertEquals(true, test.isAnagram(a, b));
    }

}
