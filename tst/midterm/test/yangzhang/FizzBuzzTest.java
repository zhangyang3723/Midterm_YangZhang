package midterm.test.yangzhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import midterm.yang.zhang.FizzBuzz;

public class FizzBuzzTest {
	
	private FizzBuzz test;
	
	@Before
	public void init() {
		test = new FizzBuzz();
	}
	
	@Test
	public void testNumCanBeDividedBy3() {
		Assert.assertEquals("fizz", test.printFizzBuzz(3));
		Assert.assertEquals("fizz", test.printFizzBuzz(6));
		Assert.assertEquals("fizz", test.printFizzBuzz(33));

	}
	
	@Test
	public void testNumCanBeDividedBy5() {
		Assert.assertEquals("buzz", test.printFizzBuzz(10));
		Assert.assertEquals("buzz", test.printFizzBuzz(10000));
		Assert.assertEquals("buzz", test.printFizzBuzz(335));
		Assert.assertEquals("buzz", test.printFizzBuzz(995));
	}
	
	@Test
	public void testNumCanBeDividedBy5And3() {
		Assert.assertEquals("fizz buzz", test.printFizzBuzz(15));
		Assert.assertEquals("fizz buzz", test.printFizzBuzz(30));
		Assert.assertEquals("fizz buzz", test.printFizzBuzz(450));
		Assert.assertEquals("fizz buzz", test.printFizzBuzz(480));
	}
	
	@Test
	public void testNumCannotBeDividedBy3Or5() {
		Assert.assertEquals(null, test.printFizzBuzz(2));
		Assert.assertEquals(null, test.printFizzBuzz(52));
		Assert.assertEquals(null, test.printFizzBuzz(331));
		Assert.assertEquals(null, test.printFizzBuzz(92));
	}

}
