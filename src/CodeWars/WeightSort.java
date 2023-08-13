package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WeightSort {

	public static void main(String[] args)
	{
		String arr= "2000 10003 1234000 44444444 9999 11 11 22 123";
		System.out.println(orderWeight(arr));
	}
	public static String orderWeight1(String str)
	{
		String[] arr=str.split(" ");
		Map<String,Integer> map= new TreeMap<>();
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length();j++)
			{
				char ch=arr[i].charAt(j);
				sum=sum+Integer.parseInt(String.valueOf(ch));
			}
			System.out.println(sum +" "+ arr[i]);
	    }
		
		
		
		
		
		
		
		
		
		
		
//		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//		//
//		list.sort(Map.Entry.comparingByValue());
//		
//		for (Entry<String, Integer> entry : list)
//		{
//			String key=entry.getKey();
//			Integer value=entry.getValue();
//			result=result+value+" ";
//		}
		return result;
     }
	
	
	public static String orderWeight(String strng)
	{
	    String[] result = strng.split(" ");
	    String tmp = "";
	    for(int i = 0; i < result.length; i++)
	    {
	      for(int j = 0; j < result.length; j++)
	      {
	        if(weight(result[i]) < weight(result[j]))
	        {
	          tmp = result[i];
	          result[i] = result[j];
	          result[j] = tmp;
	        }
	        if(weight(result[i]) == weight(result[j]))
	        { 
	          for(int a = 0; a < result[i].length()  && a < result[j].length(); a++)
	          {
	            if(result[i].charAt(a) < result[j].charAt(a))
	            {
	              tmp = result[i];
	              result[i] = result[j];
	              result[j] = tmp;
	              break;
	            } 
	            else if(result[i].charAt(a) > result[j].charAt(a))
	            {
	            	break;
	            }
	          }
	        }
	      }
	    }
	    return String.join(" ", result);
  }

  public static int weight(String str)
  {
    int sum = 0;
    for(int k = 0; k < str.length(); k++)
    {
      sum += Integer.valueOf("" + str.charAt(k));
    }
    return sum;
  }
}
