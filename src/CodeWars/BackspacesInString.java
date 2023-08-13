package CodeWars;

import java.util.Arrays;

public class BackspacesInString {

	public static void main(String[] args) {
		String s = "abc#d##c";
		System.out.println(cleanString(s));

	}

	public static String cleanString(String s)
	{
		String result="";
		for(char i:s.toCharArray())
		{
			if(i=='#')
			{
				result=result.substring(0,result.length()-1);
			}
			else
			{
				result=result+i;
			}
		}
		return result;
	   
	}
	

}
