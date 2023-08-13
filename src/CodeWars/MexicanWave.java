package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {

	public static void main(String[] args)
	{
		String s="gap and also gap";
		System.out.println(wave(s));
		
		
	}
//	public static String[] wave(String s)
//	{ 
//		List<String> result = new ArrayList<String>();
//		char ch[]=s.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			char upper=Character.toUpperCase(ch[i]);
//			result.add(s.substring(0,i)+ String.valueOf(upper)+ s.substring(i+1,ch.length));	
//		}
//		return result.toArray(new String[0]);
//	}
	
	public static String[] wave(String str) {    
	      List<String> list = new ArrayList<>();
	      for (int i = 0; i < str.length(); i++)
	      {
	        char ch = str.charAt(i);
	        if (ch == ' ')
	        {
	        	continue;
	        }
	        list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
	      }
	      return list.toArray(new String[0]);
	    }

}
