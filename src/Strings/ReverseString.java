package Strings;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String s="durga";
		//
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			// will print the index of the specified letter
		//	int j=s.indexOf("a");
			
		}
	  System.out.println(rev);		
	}

}
