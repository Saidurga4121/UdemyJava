package CodeWars;

public class Scramblies {

	public static void main(String[] args)
	{
		String s1 = "rkqodlw";
		String s2 = "world";
		System.out.println(scramble(s1,s2));

	}
	
	public static boolean scramble(String s1, String s2) 
	{
		int count=0;
		String temp= s1;
		boolean flag=false;
		for(int i=0;i<s2.length();i++)
		{
			char ch= s2.charAt(i);
			if(temp.contains(String.valueOf(ch)))
			{
				temp=temp.replaceFirst(String.valueOf(ch), "");
				count++;
			}
		}
		
        return count==s2.length();
    }

}
