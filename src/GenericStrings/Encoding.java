package GenericStrings;

public class Encoding 
{
	public static void main(String[] args) 
	{
		// SIMPLY
		// UKORNA
		
		String s1="simplz";
		String s2="";
		//
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='y' || ch=='z')
			{
				ch=(char) (ch-24);
				System.out.print(ch);
			}
			else
			{
				ch= (char) (ch+2);
				System.out.print(ch);
			}
		}
		
	}

}
