package CodeWars;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

	public static void main(String[] args)
	{
		String s="The1 quick brown fox jumps over the lazy dog";
		System.out.println(check1(s));
	}	
	public static boolean check(String sentence)
	{
		sentence=sentence.toLowerCase();
		boolean flag=true;
		for(char ch='a';ch<='z';ch++)
		{
			if(!sentence.contains(String.valueOf(ch)))
			{
				flag=false;
				break;
			}
		}
	    return flag;
	}
	
	public static boolean check1(String sentence){
	    String str = sentence.toLowerCase().replaceAll("[^a-z]", "");
	    System.out.println(str);
			Set<Character> set = new HashSet<>();
			for (char c : str.toCharArray()) {
				set.add(c);
			}
			return set.size() == 26;
	  }

}
