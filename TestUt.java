import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class TestUt {
	Even e;

	@Before
	public void setUp() {
		e = new Even();
	}

	@Test
	public void testFirst() {
		Assert.assertEquals(String.class, e.getMessage().getClass());
	}

	@Test(expected = ArithmeticException.class)
	public void testException() {
		e.div(5, 0);
	}

	@Test
	public void testAssertions() {
		// test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";

		int val1 = 5;
		int val2 = 6;

		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };

		// Check that two objects are equal
		assertEquals(str1, str2);

		// Check that a condition is true
		assertTrue(val1 < val2);

		// Check that a condition is false
		assertFalse(val1 > val2);

		// Check that an object isn't null
		assertNotNull(str1);

		// Check that an object is null
		assertNull(str3);

		// Check if two object references point to the same object
		assertSame(str4, str5);

		// Check if two object references not point to the same object
		assertNotSame(str1, str3);

		// Check whether two arrays are equal to each other.
		assertArrayEquals(expectedArray, resultArray);
	}

	@After
	public void tearDown() {
		System.out.println("releasing");
		e = null;
		e = null;

	}

	@BeforeClass
	public static void bef() {
		System.out.println("HEllo");
	}

	@AfterClass
	public static void aft() {
		System.out.println("Hii");
	}
}
