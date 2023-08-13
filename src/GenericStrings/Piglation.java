package GenericStrings;

public class Piglation 
{
	public static void main(String[] args) 
	{
		// EAT -  EATWAY
		// CLEAR- EARCL
		String s1="hello";
		s1=s1.toUpperCase();
		String s2="";
		//
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' )
			{
				if(i==0)
				{
					s2=s1+"AY";
					break;
				}
				else
				{
					s2=s1.substring(i)+s1.substring(0,i)+"AY";
					break;
				}
				
			}
		}
		System.out.println(s2);
		
	}

}
