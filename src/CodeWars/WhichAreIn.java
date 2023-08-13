package CodeWars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhichAreIn {

	public static void main(String[] args) 
	{
		String[] s1 = {"arp", "live", "strong"};
		String[] s2= {"lively", "alive", "harp", "sharp", "armstrong"};
		//
		System.out.println(inArray(s1,s2));
//		int count=0;
//		for(int i=0;i<s2.length;i++)
//		{
//			for(int j=0;j<s1.length;j++)
//			{
//				if(s2[i].contains(s1[j]))
//				{
//					count++;
//					break;
//				}
//			}
//		}
//		if(count==s2.length)
//		{
//			System.out.println(Arrays.toString(s1));
//			
//		}
//		else
//		{
//			System.out.println("false");
//		}
		

	}
	public static String inArray(String[] s1, String[] s2) 
	{
		Set<String> set= new HashSet<>();
		//
		for(String i: s2)
		{
			for(String j: s1)
			{
				if(j.contains(i))
				{
					set.add(i);
					break;
				}
			}
		}
		String[] resultArray = set.toArray(new String[set.size()]);
	    Arrays.sort(resultArray); 
	    return Arrays.toString(resultArray);
	}

}
