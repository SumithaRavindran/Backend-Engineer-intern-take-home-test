import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringToIntegerConverterTest {
	@Test
	public void testPostiveInteger() {
		int actual = StringToIntegerConverter.stringToint("1234");
		assertEquals(1234, actual);
	}
	@Test
	public void testNegativeInteger() {
		int actual = StringToIntegerConverter.stringToint("-1234");
		assertEquals(-1234, actual);
	}
	@Test
	public void testNullValue() {
		int actual = StringToIntegerConverter.stringToint(null);
		assertEquals(0, actual);
	}
	@Test
	public void testEmptyValue() {
		int actual = StringToIntegerConverter.stringToint("");
		assertEquals(0, actual);
	}
}
