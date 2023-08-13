package MapPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurence {

	public static void main(String[] args) {
		int arr[]= {1,2,1,2,3,4,3,5};
		Map<Integer,Integer> map= new LinkedHashMap<>();
		//
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
			
		}
		System.out.println(map);
		
	}

}
