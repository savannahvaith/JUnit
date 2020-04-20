package com.qa.Example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AssertTest {
	
	@Test
	public void boolIsTrueTest() {
		boolean boo = true; 
		assertTrue("Expected: Flag set to true", boo);
	}
	
	@Test
	public void falseTest() {
		boolean boo1 = false;
		assertFalse("Expected: Flag set to false", boo1);
	}
	
	@Test
	public void objectIsNull() {
		Object obj = null;
		assertNull("Expected: Null Object", obj);
	}
	
	@Test
	public void objectNotNull() {
		Object obj = "Something";
		assertNotNull("Expected: Not null object", obj);
	}
	
	@Test
	public void objectsAreTheSame() {
		Object obj = "Savannah Vaith";
		Object obj2 = obj;
		assertSame("Expected: Both objects to be the same",obj,obj2);
	}
	
	@Test
	public void objectsNotTheSame() {
		Object obj1 = "alpha beta";
		Object obj2 = "charlie delta";
		assertNotSame("Expected: both objects are not the same", obj1, obj2);
	}
	
	@Test
	public void failTest() {
		if(false) { 
			fail();
		}else {
			assertTrue(true);
		}
	}

}
