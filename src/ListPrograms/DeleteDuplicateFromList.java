package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicateFromList 
{
	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(1,2,3,9,5,7,9,6,9);
		List<Integer> newList=new ArrayList<>();
		//
		for(int i:list)
		{
			if(!newList.contains(i))
			{
				newList.add(i);
			}
		}
		
//		for(int i=0;i<list.size();i++)
//		{
//			if(!newList.contains(list.get(i)))
//			{
//				newList.add(list.get(i));
//			}
//		}
		System.out.println(newList);
		//
		// another way of removing duplicates.
		Set<Integer> set= new LinkedHashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		System.out.println(list);
		
		
		
		
	}

}
