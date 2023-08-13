package GenericStrings;

public class DivideStringToTwoParts 
{
	public static void main(String[] args)
	{
		String s="abcdfed";
		
			if(s.length()%2==0)
			{
				int len=s.length()/2;
				System.out.println(s.substring(0,len));
				System.out.println(s.substring(len));
			}
			else
			{
				System.out.println("we cannot divide the string in to two parts");
			}
	
		
		
	}

}
