package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists 
{
	public static void main(String[] args)
	{
		// if insertion or deletion then go for linked list ...for fetching values ..go for arraylist
		// duplicates and null values are allowed.
		// insertion order is preserved.
		Integer[] arr= new Integer[] {1,2,3,4,5};
		// adding the array to list
		List<Object> list= new ArrayList<Object>(Arrays.asList(arr));
		//
		list.add("sai");  // 0
		list.add(17.9);   // 1
		list.add(2,17.8); // 2
		list.add(26);     // 3
		list.add(true);   // 4
		list.add('K');    // 5
		list.add(null);   // 6
		// set method will replace the existing 1st value with the new value
		list.set(1, 222);
		// add with add next to the value
		list.add(1,true);
		
		// below methods belong to linked list
//		list.addFirst("kartheek");
//		list.removeLast();
		//
		// list.remove(6);
		System.out.println(list.get(0));
		System.out.println(list);
		
		
		//
		
		
		
		/////////////////////////////////////////////////////////////////////////////////
		// how arraylist works internally
		// ArrayList<String> list= new ArrayList<>();
		// as soon as it sees the above line ....it creates a default array list and when the elemnet is added the size will be 10
		// which ever the order the elements are preserved ...that order only we can retrive data (Insertion order)
		// as soon as 10 elements are inserted then the list will grow by 50 % ..that means 15 will be the size now.
		// insertion/removal in arraylist is not recommended bcz if we want to insert an element , we have to shift all the elements to its right side
		// for fetching process ...arraylist is a good choice bcz its takes 1 sec to fetch the element (random access)
		
		
		
	}

}
	