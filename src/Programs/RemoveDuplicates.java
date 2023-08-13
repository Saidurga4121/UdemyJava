package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,1,2,4};
		//
		String array=Arrays.toString(arr);
		List<String> list= Arrays.asList(array);
		List<String> dupList= new ArrayList<>();
		
		Set<String> set= new HashSet<>();
		
		for(String i: list)
		{
			if(set.contains(i))
			{
				dupList.add(i);
			}
			else
			{
				set.add(i);
			}
		}
		System.out.println(set);
		System.out.println(dupList);

	}

}
