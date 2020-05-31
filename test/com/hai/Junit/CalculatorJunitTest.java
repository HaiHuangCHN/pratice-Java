package com.hai.Junit;

import org.junit.Assert;
import org.junit.Before;
/*
 * To test all
 */
import org.junit.Test;


public class CalculatorJunitTest {
	
	Calculator c;
	
	@Before
	public void testBeforeClass() {
		c = new Calculator();
		
	}
	
	@Test
	public void testAdd () {
/*		Calculator c = new Calculator();*/
		int result1 = c.add(1, 2);
		Assert.assertEquals(result1, 5);
	}
	
	@Test
	public void testSub () {
/*		Calculator c = new Calculator();*/
		int result1 = c.sub(1, 2);
		Assert.assertEquals(result1, -1);
	}
	

}
