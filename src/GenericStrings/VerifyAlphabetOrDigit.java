package GenericStrings;

public class VerifyAlphabetOrDigit 
{
	public static void main(String[] args) 
	{
		String s="its S1I2m%p5lE";
		String upper="";
		//
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			// char Upper=Character.toUpperCase(s.charAt(i))
			if(Character.isAlphabetic(ch))
			{
				if(ch>='a' || ch<='z')
				{
					if(Character.isUpperCase(ch))
					{
						upper=upper+ch;	
					}
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
					{
						System.out.println(ch + " is vowel");
					}
				}	
			}
			else if(Character.isDigit(ch))
			{
				System.out.println(ch + " is digit");
			}
			else if(ch!=' ')
			{
				System.out.println(ch + " is special character");
			}
			
		}
		System.out.println(upper + " iam in upper");
		
		
	}

}
