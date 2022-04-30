import static org.junit.Assert.*;

import org.junit.Test;

public class PayTest {

	@Test
    public void testCase1() {
        assertEquals("Successful Payment", Pay.card("1111111111111111", "0322", "012", "Bruce Wayne"));
    }

	@Test
    public void testCase2() {
        assertEquals("Failed Payment", Pay.card("1111111111111111", "0322", "012", ""));
    }

	@Test
    public void testCase3() {
        assertEquals("Failed Payment", Pay.card("1111111111111111", "0322", "1234", "Bruce Wayne"));
    }

	@Test
    public void testCase4() {
	    assertEquals("Failed Payment", Pay.card("1111111111111111", "1322", "012", "Bruce Wayne"));
    }

	@Test
    public void testCase5() {
	    assertEquals("Failed Payment", Pay.card("1111111111", "0322", "012", "Bruce Wayne"));
    }
}
