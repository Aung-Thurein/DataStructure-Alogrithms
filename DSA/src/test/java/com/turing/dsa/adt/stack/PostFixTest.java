package com.turing.dsa.adt.stack;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PostFixTest {
	
		
	   @Test
	    public void testBaseCase()
	    {
	        assertEquals("ab+",PostFixTransformer.transform("a+b"));
	    }
	    
	    @Test
	    public void testThreePoint1()
	    {
	        assertEquals("abc*+",PostFixTransformer.transform("a+b*c"));
	    }
	    
	    @Test
	    public void testThreePoint2()
	    {
	        assertEquals("ab*c+",PostFixTransformer.transform("a*b+c"));
	    }
	    
	    @Test
	    public void testThreePoint3()
	    {
	        assertEquals("ab-c+",PostFixTransformer.transform("a-b+c"));
	    }
	    
	    @Test
	    public void testParaenthesis()
	    {
	        assertEquals("ab+c*",PostFixTransformer.transform("(a+b)*c"));
	    }
	    
	    @Test
	    public void testParaenthesis2()
	    {
	        assertEquals("ab+cd/*",PostFixTransformer.transform("(a+b)*(c/d)"));
	    }
	    
	    @Test
	    public void testParaenthesis3()
	    {
	        assertEquals("abc*d++e/",PostFixTransformer.transform("a+(b*c+d)/e"));
	    }
	    @Test
	    public void testParaenthesis4()
	    {
	        assertEquals("abc*d++e/",PostFixTransformer.transform("a+(b*c+d)/e"));
	    }
	    @Test
	    public void testParaenthesis5()
	    {
	        assertEquals("ab+c*def+/g-",PostFixTransformer.transform("(a+b)*c/d(e+f)-g"));
	    }
	    @Test
	    public void testParaenthesis6()
	    {
	        assertEquals("abc*d/+e-",PostFixTransformer.transform("a+b*c/d-e"));
	    }
	   
	   

}
