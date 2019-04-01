package com.evry.JunitTopics;

public class SquareOfNumberInArray {

	
	public int [] squareOfArray(int a[]) {
		
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]*a[i];
		}
		
		return b;
		
	}
}
