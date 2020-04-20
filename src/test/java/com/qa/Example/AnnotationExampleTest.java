package com.qa.Example;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationExampleTest {
	
	// The test annotation denotes that the method below should be ran 
	// as part of the JUnit test
	@Test
	public void test1() {
		fail("Fail");
	}
	
	// Precedes the method that is to be executed
	// Only once
	// Before the tests within that class run.
	@BeforeClass
	public static void setUp() {
		System.out.println("Before Class");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	
	// Runs after the test - it is ran last
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class");
	}
	
	// This is to executed before EVERY @Test annotation
	@Before 
	public void init() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	// Executed after EVERY @Test annotation 
	@After
	public void after() {
		System.out.println("After Test");
	}
	
	// Ignore - to skip that method
	@Test
	@Ignore
	public void test4() {
		System.out.println("Test 4");
	}
	
}
