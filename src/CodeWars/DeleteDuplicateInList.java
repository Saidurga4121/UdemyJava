package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeleteDuplicateInList {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,1,2,1,2,3};
		System.out.println(deleteNth(arr,3));
	}
	public static int[] deleteNth(int[] elements,int maxOccurences)
	{
		List<Integer> list= new ArrayList<>();
		//
		int count;
		for(int i=0;i<elements.length;i++)
		{
			count=0;
			for(int j=0;j<=i;j++)
			{
				if(elements[i]==elements[j])
				{
					count++;
				}
			}
			System.out.println(count+ " "+ elements[i]);
			if(count<=maxOccurences)
			{
				list.add(elements[i]);
			}
		}
		System.out.println(list);
		
		int[] arr= new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
        
		return arr;
		
	}
}
