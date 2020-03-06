package com.fdmgroup.FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {
	private FizzBuzz fib;

	@Before
	public void setUp() throws Exception {
		fib = new FizzBuzz();
	}

	@Test
	public void test() {
		String result = fib.calcFizzBuzz(1);
		assertEquals("1",result);
	}

}
