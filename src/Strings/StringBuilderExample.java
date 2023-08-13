package Strings;

public class StringBuilderExample 
{
	public static void main(String[] args) 
	{
		StringBuilder builder= new StringBuilder("Hello");
		builder.append(" world");
		System.out.println(builder);
		//
		builder.reverse();
		System.out.println(builder);
		
	}

}
