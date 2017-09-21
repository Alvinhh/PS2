package base;

import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class MyIntegerTest {

	@Test
	public void testEven() {
		MyInteger myInt = new MyInteger(2);
		assertTrue(myInt.isEven());
	}
	@Test
	public void testOdd() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isOdd());
	}
	@Test
	public void testPrime() {
		MyInteger myInt = new MyInteger(5);
		assertTrue(myInt.isPrime());
	}
	@Test
	public void testisEquals() {
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isEquals(myInt));
	}
	
}
