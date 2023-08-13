package Programs;

import java.util.Arrays;

public class Anagrams 
{
	public static void main(String[] args)
	{
		String s1="def;acbc";
		String s2="21agurd";
		
		//
		char[] ch1=s1.toCharArray();
		char[] ch2= s2.toCharArray();
		
		// 
		Arrays.sort(ch1);
		System.out.println(ch1);
		Arrays.sort(ch2);
		//
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("anagaram");
		}
	}

}
