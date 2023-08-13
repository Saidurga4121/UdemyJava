package CodeWars;

import java.util.Arrays;

public class Abbreviator {

	public static void main(String[] args)
	{
		String s = "mat'sat'cat doggy_mat; monolithic";
		System.out.println(abbreviate(s));
	}

	public static String abbreviate(String s) 
	{
		String result="";
		String words[]=s.split("[^a-zA-Z]+");
		String seperators[]=s.split("[a-zA-Z]+");
		for(int i=0;i<seperators.length;i++)
		{
			System.out.println(seperators[i] + " iam ");
		}
		int i=1;
		for(String e: words)
		{
			result=result+processWord(e);
			if(i < seperators.length)
			{
				result=result+seperators[i++];
			}
		}
		return result;
		
		
	}
	
	public static String processWord(String i)
	{
	    String result="";
		if (i.length() > 3)
		{
				int len = i.length() - 2;
				result = result + i.substring(0, 1) + len + i.substring(i.length() - 1) + " ";
		} 
		else
		{
				result = result + i + " ";
		}
		return result;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//String[] arr = s.split("[_\\-\\s]");
//		String[] words = s.split("[^a-zA-Z]+");
//        String[] separators = s.split("[a-zA-Z]+");
//        System.out.println(Arrays.toString(words));
//        System.out.println(Arrays.toString(separators));
//        
//		String result = "";
//		//
//		for (int i = 0; i < words.length; i++)
//		{
//			if (words[i].length() > 3)
//			{
//				int len = words[i].length() - 2;
//				result = result + words[i].substring(0, 1) + len + words[i].substring(words[i].length() - 1) + " ";
//			} 
//			else
//			{
//				result = result + words[i] + " ";
//			}
//		}
//		return null;
//	}
//
//}
