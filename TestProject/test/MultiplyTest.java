package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		JUnit test=new JUnit();
		int result=test.multiply(5,8);
		assertEquals(40,result);
	}

	@Test
	public void testDiff() {
		JUnit test=new JUnit();
		int result=test.diff(5,2);
		assertEquals(3,result);
	}
}
