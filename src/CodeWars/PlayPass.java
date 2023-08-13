package CodeWars;

public class PlayPass {

	public static void main(String[] args)
	{
		String s = "BORN IN 2015!";
		System.out.println(playPass(s, 2));
	}

	public static String playPass(String s, int n)
	{
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (Character.isAlphabetic(ch[i])) 
			{
				if (Character.isUpperCase(ch[i]))
				{
					char c = (char) (ch[i] + n);
					ch[i] = c;
				}
				else
				{
					char c = (char) (ch[i] + n);
					ch[i] = c;
				}
				// 
				if (i % 2 != 0)
				{
					ch[i] = Character.toLowerCase(ch[i]);
				}
				else
				{
					ch[i] = Character.toUpperCase(ch[i]);
				}
			} 
			else if (Character.isDigit(ch[i])) 
			{
				ch[i] = (char) (9 - (ch[i] - '0') + '0');
			}
			
		}
		return new StringBuilder(new String(ch)).reverse().toString();
	}
}
