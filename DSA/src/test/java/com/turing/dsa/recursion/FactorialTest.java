package com.turing.dsa.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.turing.dsa.reursion.Factorial;

public class FactorialTest {

	
	@Test
	public void test()
	{
		int result = Factorial.factorial(3);
		assertEquals(result, 6);
		
		 result = Factorial.factorial(4);
		assertEquals(result, 24);
	}
}
