package midterm.test.yangzhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import midterm.yangzhang.FindDuplicates;

public class FindDuplicatesTest {

	private FindDuplicates test;

	@Before
	public void init() {
		test = new FindDuplicates();
	}

	@Test
	public void testArrayWithOneDuplicates() {
		int[] a = { 2, 3, 4, 5, 6, 6 };
		int[] b = { 2, 2, 4, 5, 7, 6 };
		Assert.assertTrue(test.containsDuplicate(a));
		Assert.assertTrue(test.containsDuplicate(b));
	}

	@Test
	public void testArrayWithMultipleDuplicates() {
		int[] a = { 2, 2, 4, 4, 6, 6 };
		int[] b = { 2, 0, 0, 0, 0, 6 };
		Assert.assertTrue(test.containsDuplicate(a));
		Assert.assertTrue(test.containsDuplicate(b));
	}

	@Test
	public void testArrayWithNoDuplicates() {
		int[] a = { 2, 3, 4, 5, 6, 7 };
		int[] b = { 12, 56, 78, 3, 67, 36 };
		Assert.assertFalse(test.containsDuplicate(a));
		Assert.assertFalse(test.containsDuplicate(b));
	}

	@Test
	public void testArrayWithOneElement() {
		int[] a = { 2 };
		int[] b = { 56 };
		Assert.assertFalse(test.containsDuplicate(a));
		Assert.assertFalse(test.containsDuplicate(b));
	}

	@Test
	public void testEmptyArray() {
		int[] a = {};
		Assert.assertFalse(test.containsDuplicate(a));
	}

	@Test(expected = NullPointerException.class)
	public void testNullPointerException() {
		int[] a = null;
		Assert.assertFalse(test.containsDuplicate(a));
	}

}
