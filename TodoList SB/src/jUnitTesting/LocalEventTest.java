package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.LocalEvent;

public class LocalEventTest {

	@Test
	public void getTaskTest() {
		String a = "fire";
		LocalEvent test = new LocalEvent(a);
		String result = test.getTask();
		assertEquals("fire", result);
		
		 
	}
	
	
		
}


