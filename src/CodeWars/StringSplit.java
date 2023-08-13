package CodeWars;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) 
	{
		String s="abcdefg";
		String result="";
		if(s.length()%2!=0)
		{
			s=s+"_";
			// System.out.println(s);
		}
		int i=0;
		while(i<s.length())
		{
			result=result+s.charAt(i)+s.charAt(i+1)+" ";
			i+=2;
		}
		System.out.println(result);
		
	}
	

}