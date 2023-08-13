package Array;

import java.util.Arrays;

public class Sorting 
{
	public static void main(String[] args)
	{
		int a[]= {80,70,60,100,110};
		Arrays.sort(a);
		//
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		String s[]= {"a", "c", "b"};
		Arrays.sort(s);
		
//		for(int j=0;j<s.length;j++)
//		{
//			System.out.println(s[j]);
//		}
		
		for(String s1:s)
		{
			System.out.println(s1);
		}	
	}
}
