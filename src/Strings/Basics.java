package Strings;

public class Basics 
{
	public static void main(String[] args)
	{
		String s1="saidurga";
		String s2="kovvuri";
		// trim method will remove the spaces
		String s3=" welcome to strings ";
		
		System.out.println(s1.length());
		// s1+s2 also will work in the same way
		System.out.println(s1.concat(s2));
		System.out.println(s3.trim());
		
		////////****************************************////////////////
		char ch=s1.charAt(3);
		System.out.println(ch);
		//
		boolean flag=s1.contains("sai");
		System.out.println(flag);
		//
		boolean flag1=s1.equals("saiDurga");
		System.out.println(flag1);
		//
		String replacedText=s1.replace("durga", "kartheek");
		System.out.println(replacedText);
		//
		// 0 1 2 3 4 5 6 7
		// s a i d u r g a
		String substring=s1.substring(1, 4);
		System.out.println(substring);
	}

}
