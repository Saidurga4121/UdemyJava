package MapPrograms;

import java.util.*;

public class DeleteDuplicates {

	public static void main(String[] args) 
	{
		int arr[]= {2,1,3,2,3,1,4};   // , 1-1, 3-2,2-3
		Map<Integer,Integer> map= new LinkedHashMap<>();
		//
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.remove(arr[i]);
			}
			map.put(arr[i], i);
		}
		System.out.println(map);
	}
	
	
	// 

}
