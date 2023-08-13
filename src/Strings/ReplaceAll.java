package Strings;

public class ReplaceAll 
{

	public static void main(String[] args) 
	{
		String s="My nama is sai";
		//
		String s2=s.replaceAll("\\s", "-");  //  \\s indicates white spaces
		System.out.println(s2);
		
		String s3= s.replaceAll("[A-Z]", "-");  // [A-Z] replaces any char between a to z with the specified char.
		System.out.println(s3);
		
		String s4= s.replaceAll("[^0-9]", "-");  // 
		System.out.println(s4);
		
		String s5=s.replaceAll("[^aA]","");
		System.out.println(s5);
		
		
		////////////////////////////////////////////////////////
		
//		"\\s"-------------------white space
//		"[A-Z]"-----------------a to z any character it will take to replace
//		"[^a-z]"----------------its not symbol ..(not character from a-z..a.remaming it wil take)
//		"[0-9]"-----------------0 to 9
//		"[^aA]"-----------------replaces all characters expect aA.
//		"[_\\-]"----------------(_ or -) // it takes either underscore or hipen
		
		
		
		
		
		

	}

}
