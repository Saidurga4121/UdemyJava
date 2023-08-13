package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetLengthOfMissingArray {

	public static void main(String[] args) 
	{
		Object[][] arrayOfArrays= {
						{1, 2, 4, 5},
						{1, 3, 4, 5},
						{1, 3},
						{1, 2, 3, 4, 6},
						{2, 3, 5, 6},
		                          };
		System.out.println(getLengthOfMissingArray1(arrayOfArrays));
	}
	
	public static int getLengthOfMissingArray1(Object[][] arrayOfArrays)
	{  
	    if (arrayOfArrays == null || arrayOfArrays.length == 0) 
	    {
	    	return 0;
	    } 
	    int[] arrayOfSizes = new int[arrayOfArrays.length];
	    for (int i = 0; i < arrayOfArrays.length; i++)
	    {
	      if(arrayOfArrays[i] == null ||arrayOfArrays[i].length == 0)
	      {
	    	  return 0;
	      }
	      arrayOfSizes[i] = arrayOfArrays[i].length;
	    }
	    Arrays.sort(arrayOfSizes);
	    System.out.println(Arrays.toString(arrayOfSizes));
	    for (int i = 0; i < arrayOfSizes.length-1; i++)
	    {
		     if(arrayOfSizes[i+1] - arrayOfSizes[i] - 1 != 0)
		     {
		        return arrayOfSizes[i] + 1;
		     }
	    }
	    return 0;
	  }
	public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
	{
		if(arrayOfArrays.length==0 || arrayOfArrays == null )
		{
			return 0;
		}
		List<Integer> list= new ArrayList<>();
		int len=0;
		int index=0;
		for(int i=0;i<arrayOfArrays.length;i++)
		{
			if(arrayOfArrays[i] == null ||arrayOfArrays[i].length == 0)
		    {
		    	  return 0;
		    }
			len=arrayOfArrays[i].length;
			list.add(len);
		}
		Collections.sort(list);
		System.out.println(list);
		for(int i=list.get(0);i<=list.get(list.size()-1);i++)
		{
			if(list.contains(0))
			{
				index=0;
			}
			if(!list.contains(i))
			{
				index=i;
			}
		}
	    return index;
	}

}
