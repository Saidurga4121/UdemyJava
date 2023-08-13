package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteElementsOfList1FromList2 
{
	public static void main(String[] args) 
	{
		List<Integer> list1= Arrays.asList(4,5);
		List<Integer> list2= Arrays.asList(1,2,3,4,5);
		List<Integer> list3= new ArrayList<>();
		//
		for(int temp: list2)
		{
			if(!list1.contains(temp))
			{
				list3.add(temp);
			}
		}
		System.out.println(list3);
		
		
	}

}
