package Programs;

public class LetterCombination 
{
	public static void main(String[] args)
	{
		String s="GOD";
		//
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				for(int k=0;k<s.length();k++)
				{
					if(i!=j && i!=k && j!=k )
					{
						System.out.print(s.charAt(i));
						System.out.print(s.charAt(j));
						System.out.println(s.charAt(k));
//						System.out.print(" "+s1.charAt(i) + s1.charAt(j) +s1.charAt(k));
//						System.out.println();

					}
				}
			}
		}
		
	}

}
