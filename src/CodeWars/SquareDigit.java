package CodeWars;

public class SquareDigit {
	public static int squareDigits(int n) 
	{
		String input = String.valueOf(n);
		String result="";
		for (int i = 0; i < input.length(); i++)
		{
			char ch = input.charAt(i);
			int a = Integer.parseInt(String.valueOf(ch));
			result =result+( a * a);	
		}
		return Integer.parseInt(result); 
	}

	public static void main(String[] args)
	{
		int n = 765;
		int ch=squareDigits(n);
		System.out.println(ch);	
	}
}
