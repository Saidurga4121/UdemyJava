package CodeWars;

public class JadenCase {

	public static void main(String[] args) 
	{
		String s="Most Trees Are Blue[]";
		String result=toJadenCase(s);
		System.out.println(result);

	}

	public static String toJadenCase(String phrase)
	{
		String[] arr=phrase.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++)  
		{
			if(phrase == null || phrase.equals("")) 
			{
				return null;
			}
				
			String firstLetter=arr[i].substring(0,1).toUpperCase();  
			String remianingLetters=arr[i].substring(1, arr[i].length()).toLowerCase(); 
			result=result+firstLetter+remianingLetters+" ".trim();
		}

		return result;
		
		
	}
}
