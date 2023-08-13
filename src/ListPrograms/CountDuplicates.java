package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountDuplicates 
{
	public static void main(String[] args) 
	{
		List<String> list= Arrays.asList("A","B","C","A","B");
		// here iam not converting the list to set ..however ..iam creating a new set and adding the list elements
		Set<String> set= new LinkedHashSet<>();
	    List<String> duplicates = new ArrayList<>();
		//
	    // to remove duplicates and find duplicates
	    set=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(set);
		
		
		// second way
		for(int i=0;i<list.size();i++)
		{
			// till line 38 it will remove duplicates or print duplicates
			if (set.contains(list.get(i)))
			{
	            duplicates.add(list.get(i));
	        } 
			else 
			{
	            set.add(list.get(i));
	        }	
			
			// we can count the frequency of each string.
			if(set.add(list.get(i))==false)
			{
			     int count= Collections.frequency(list, list.get(i));
				 System.out.println(list.get(i) + count);
			}	
		}
		System.out.println(duplicates);
		
		
		
		
		
	}

}
