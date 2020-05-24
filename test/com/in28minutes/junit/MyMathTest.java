package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


//call MyMath.sum method
//sum(int[]{1,2,3})-->6
//assertEquals(expected result, actual result);

public class MyMathTest {
	MyMath myMath=new MyMath();
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	@Test
	public void sum_with3numbers() {
		//fail("Not yet implemented");<--default line
		//absence of failure is success
		System.out.println("test 1");
		assertEquals(6, myMath.sum(new int [] {1,2,3}));	
	}
	
	@Test
	public void sum_with1number() {
		System.out.println("test 2");
		assertEquals(1, myMath.sum(new int [] {1}));	
	}
	

}
