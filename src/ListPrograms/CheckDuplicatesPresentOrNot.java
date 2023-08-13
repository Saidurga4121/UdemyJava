package ListPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesPresentOrNot 
{
	public static void main(String[] args) 
	{
		List<String> list= new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("2");
		list.add("2");
		System.out.println(list);
		//
		Set<String> set= new HashSet<>(list);
		// converting list to set
		// set.addAll(list);
		System.out.println(set);
		
		//
		if(list.size()==set.size())
		{
			System.out.println("duplicates are not present");
		}

		
		
		
	}

}
