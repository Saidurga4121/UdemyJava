package Strings;

public class Conversions 
{
	public static void main(String[] args)
	{
		// string to char
		String s1="hello";
		char[] ch=s1.toCharArray();  
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(ch[i]);
		}
		//**************float to int***************************//
		float f1 = 123.45f;
		// casting
	    int x = (int) f1;
	    System.out.println(x);    
		//************float to double**************************//
	    float f = 96.67f;
	    //************float to double**************************//
	    float f2=12.3F;//F is the suffix for float  
	    String s=Float.toString(f2); 
	    System.out.println(s);
	    //************float to char**************************//
	    float vIn = 65.0f;
	    char vOut = (char)vIn;
	    System.out.println(vOut);
	    //************double to int**************************//
	    double d=10.0;
	    Float i=(float)d;
	    System.out.println(i);
	    //************double to int**************************//
        char ch1='a';
	    double f3 = (double)ch1;
	    System.out.println(f3);

	    
	    
		
	}
}
