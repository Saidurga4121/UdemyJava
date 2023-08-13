package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsOfList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Hii");
		list1.add("Geeks");
		list1.add("for");
		list1.add("Geeks");
        //
		System.out.println("List1: " + list1);

		List<String> list2 = new ArrayList<String>();
		list2.add("Hii");
		list2.add("Geeks");
		list2.add("Gaurav");
		//
		System.out.println("List2: " + list2);
		
		List<String> list3 = new ArrayList<String>();
		
		for(String i:list1)
		{
			if(list2.contains(i))
			{
				list3.add(i);
			}
		}
  

		// Find the common elements
		// list1.retainAll(list2);

		// print list 1
		System.out.println("Common elements: " + list3);

	}

}
