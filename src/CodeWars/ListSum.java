package CodeWars;

import java.util.Arrays;

public class ListSum {

	public static void main(String[] args)
	{
		int[] n= {0, 1, 3, 6, 10};		
		System.out.println(Arrays.toString(sumParts(n)));
	}
	
	public static int[] sumParts(int[] ls) 
	{
		int newArray[]= new int[ls.length+1];
		for(int i=ls.length-1;i>=0;i--)
		{
			newArray[i]=newArray[i+1]+ls[i];
		}
		return newArray;
	   
	}

}
