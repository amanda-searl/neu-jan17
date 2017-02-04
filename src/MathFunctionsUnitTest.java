import org.junit.Test;

import junit.framework.Assert;

public class MathFunctionsUnitTest {

	@Test
	public void testSum() {
		MathFunctions mf = new MathFunctions();
		int sum = mf.sum(5, 8);
		Assert.assertTrue(sum == 13);
		sum = mf.sum(6, -6);
		Assert.assertTrue(sum == 0);
		sum = mf.sum(-12, -15);
		Assert.assertTrue(-27 == sum);
		sum = mf.sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
		Assert.assertTrue(sum > Integer.MAX_VALUE);
		System.out.println(sum + " -> " + 2 * Integer.MAX_VALUE + " -> " + Integer.MAX_VALUE);
		Assert.assertTrue(sum == 2 * Integer.MAX_VALUE);
	}

	@Test
	public void test() {
		MathFunctions mf = new MathFunctions();
		boolean prime = mf.isPrime(4);
		Assert.assertFalse(prime);
		prime = mf.isPrime(7);
		Assert.assertTrue(prime);
		prime = mf.isPrime(2);
		Assert.assertTrue(prime);

	}

}
