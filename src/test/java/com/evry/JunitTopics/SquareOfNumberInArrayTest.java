package com.evry.JunitTopics;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareOfNumberInArrayTest {

	@Test
	public void test() {
		
		SquareOfNumberInArray sa=new SquareOfNumberInArray();
		int actualarray[]= {1,2,3,4,5};
		
		int squarearray[]={1,3,9,16,25};
		
		assertArrayEquals(squarearray,sa.squareOfArray(actualarray));
	}

}
