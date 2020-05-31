package com.hai.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	@Test
	public void test1() {
		System.out.println("@Test1");
	}

	@After
	public void after() {
		System.out.println("@After");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}

	/*
	 * Test class should have exactly one [public] constructor
	 */
	public JunitTest() {
		System.out.println("Constructor");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");
	}

	@Before
	public void before() {
		System.out.println("@Before");
	}

	@Test
	public void test2() {
		System.out.println("@Test2");
	}
}
