package com.evry.JunitTopics;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		
		App a=new App();
		
		assertEquals(0,a.minNumberOfArray(new int[] {4,1,6,0,14}));
	}

}
