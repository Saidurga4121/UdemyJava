package GenericStrings;

public class BringAllDigits 
{
	public static void main(String[] args) 
	{
		String s="sa12id34ur5g7a";
		String letter="";
		String digit="";
		//
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				letter=letter+ch;
			}
			if(Character.isDigit(ch))
			{
				digit=digit+ch;
			}
		}
		System.out.println(digit+letter);
		
		// piglatin
		// encoding
		
	}

}
