package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates 
{
	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(1,2,2,3,2);
		Set<Integer> set= new HashSet<>();
		List<Integer> list1= new ArrayList<>();
		//
		for(int i:list)
		{
			if(set.contains(i))
			{
				list1.add(i);
			}
			else
			{
				set.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(set);
		
		
		
	}

}
