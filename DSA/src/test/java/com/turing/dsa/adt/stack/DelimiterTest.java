package com.turing.dsa.adt.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DelimiterTest {
	
	
	
	@Test
	public void Test() {
		DelimiterMatcher matcher = new DelimiterMatcher("c[d]");
		assertEquals(true, matcher.isValid());
	}
	
	@Test
	public void TestNegative1() {
		
		DelimiterMatcher matcher = new DelimiterMatcher("c[d");
	
		assertEquals(false, matcher.isValid());
		
	}
	
	@Test
	public void TestNegative2() {
		
		DelimiterMatcher matcher = new DelimiterMatcher("cd]");
	
		assertEquals(false, matcher.isValid());
		
	}
	@Test
	public void TestComplex1(){
		
		DelimiterMatcher matcher = new DelimiterMatcher("a{b[c]d}e");
	
		assertEquals(true, matcher.isValid());
		
	}
	@Test
	public void TestComplex2(){
		
		DelimiterMatcher matcher = new DelimiterMatcher("a{b(c]d}e");
	
		assertEquals(false, matcher.isValid());
		
	}
	@Test
	public void TestComplex3(){
		
		DelimiterMatcher matcher = new DelimiterMatcher("b{c}d]e}");
	
		assertEquals(false, matcher.isValid());
		
	}
	@Test
	public void TestComplex4(){
		
		DelimiterMatcher matcher = new DelimiterMatcher("a<b>{4}[9(43)]");
	
		assertEquals(true, matcher.isValid());
		
	}
	
	
	
	
	
	
	
	

}
