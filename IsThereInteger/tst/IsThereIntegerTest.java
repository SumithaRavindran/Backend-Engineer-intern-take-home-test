import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class IsThereIntegerTest {
	@Test
	public void testNumbers() {
		Boolean actual = IsThereInteger.isDigit("1234");
		assertTrue(actual);
	}
	@Test
	public void testNumberWithString() {
		Boolean actual = IsThereInteger.isDigit("This Is A Test4me");
		assertTrue(actual);
	}
	@Test
	public void testNegative() {
		Boolean actual = IsThereInteger.isDigit("IAMGOOD");
		assertFalse(actual);
	}
	@Test
	public void testNull() {
		Boolean actual = IsThereInteger.isDigit(null);
		assertFalse(actual);
	}
}
