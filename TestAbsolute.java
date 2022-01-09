import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * The tests for the absolute class.
 *
 * @author  n_c0de_r
 * @version 08.01.2022
 */

class TestAbsolute {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testZeroOne() {
		assertEquals(0, absolute.absoluteValueOf(0));
	}
	
	@Test
	void testPositiveOne() {
		assertEquals(1, absolute.absoluteValueOf(1));
	}

	@Test
	void testNegativeOne() {
		assertEquals(1, absolute.absoluteValueOf(-1));
	}
	
	@Test
	void testNegativeRandomNumber() {
		Random r = new Random();
		int number = r.nextInt(Integer.MAX_VALUE/2 + 2);
		assertEquals(number, absolute.absoluteValueOf(-number));
	}

	@Test
	void testPositiveMaximumInteger() {
		assertEquals(Integer.MAX_VALUE, absolute.absoluteValueOf(Integer.MAX_VALUE));
	}

	@Test
	void testNegativeMinimumInteger() {
		assertEquals(-Integer.MIN_VALUE, absolute.absoluteValueOf(Integer.MIN_VALUE));
	}

	@Test
	void testPositiveInfinity() {
		assertEquals(Integer.MAX_VALUE, absolute.absoluteValueOf((int) Double.POSITIVE_INFINITY));
	}
	
	@Test
	void testNegativeInfinity() {
		assertEquals(-Integer.MIN_VALUE, absolute.absoluteValueOf((int) Double.NEGATIVE_INFINITY));
	}

	@Test
	void testRandomPowersOfTwoEdges() {
		Random r = new Random();
		int exponent1 = r.nextInt(3);
		int exponent2 = r.nextInt(6)+3;
		int exponent3 = r.nextInt(10)+6;

		int power1 = (int) (Math.pow(2, exponent1)+1);
		int power2 = (int) (Math.pow(2, exponent2)+1);
		int power3 = (int) (Math.pow(2, exponent3)+1);
		
		assertEquals(power1, absolute.absoluteValueOf(-power1));
		assertEquals(power2, absolute.absoluteValueOf(-power2));
		assertEquals(power3, absolute.absoluteValueOf(-power3));
	}

	@Test
	void testFloatInput() {
		assertEquals(3, absolute.absoluteValueOf((int) -3.14));
	}

}
