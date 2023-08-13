package MapPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

	public static void main(String[] args) {
		 //           0  1  2  3  4  5  6  7  8  9  10 11
		int arr[] = { 3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3 };
		System.out.println(getPeaks(arr));
	}
     public static Map<String, List<Integer>> getPeaks(int[] arr)
     {
		 Map<String, List<Integer>> result = new HashMap<>();
		 result.put("pos", new ArrayList<>());
		 result.put("peaks", new ArrayList<>());
		 if (arr.length > 1)
		 {
				boolean flag = false;
				int pos = 1;
				for (int i = 1; i < arr.length; i++)
				{
					if(arr[i] < arr[i - 1])
					{
						if(flag)
						{
							flag = false;
							if(pos != arr.length - 1)
							{
									result.get("pos").add(pos);
									result.get("peaks").add(arr[pos]);
							}
						}
							pos = i;
					 } 
					else if(arr[i] != arr[i - 1])
					{
							flag  = true;
							pos = i;
					}
				}
		 }
		return result;
	}
}


