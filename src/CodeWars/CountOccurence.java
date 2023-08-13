package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

	public static void main(String[] args)
	{
		String s="aabbbac";   //  a-2  
		System.out.println(count(s));
	}
	public static Map<Character, Integer> count(String str)
	{
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character character : str.toCharArray())
        {
            if (charMap.containsKey(character))
            {
                charMap.put(character, charMap.get(character) + 1);
            }
            else 
            {
                charMap.put(character, 1);
            }
        }
        return charMap;
    }
//	public static Map<Character, Integer> count(String str)
//	{
//		Map<Character,Integer> map= new HashMap<>();
//		char[] ch=str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			int count=1;
//			for(int j=i+1;j<ch.length;j++)
//			{
//				if(ch[i]==ch[j] && ch[i]!=' ')
//				{
//					count++;
//					ch[j]=' ';
//				}
//			}
//			if(ch[i]!=' ')
//			{
//				map.put(ch[i], count);
//			}
//			
//		}
//        return map;
//    }

}
