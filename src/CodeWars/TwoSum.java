package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

	public static void main(String[] args)
	{
		int[] num= {1234,5678,9012};
		System.out.println(twoSum(num,14690));

	}
	
	public static int[] twoSum(int[] numbers, int target)
	{
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]+numbers[j]==target)
				{
					return new int[]{i, j};
//					list.add(i);
//					list.add(j);
				}
			}
		}
//		int[] arr= new int[list.size()];
//		for(int i=0;i<list.size();i++)
//		{
//			arr[i]=list.get(i);
//		}
//		System.out.println(list);
        return null;
    }

}
