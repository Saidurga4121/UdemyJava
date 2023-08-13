package Programs;

import java.util.*;

public class SortArray {

	public static void main(String[] args)
	{
		int[] arr= {5, 3, 2, 8, 1, 4};
			//     {1, 8, 3, 6, 5, 4, 7, 2, 9, 0}
		System.out.println(sortArray(arr));
	}
	public static int[] sortArray(int[] array) 
	{
		int arr[]=new int[array.length];
		List<Integer> list= new ArrayList<>();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				list.add(array[i]);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(array[i]%2!=0)
			{
				arr[i]=list.get(j);
				j++;
			}
			else
			{
				arr[i]=array[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		return array;
	}
	

}
