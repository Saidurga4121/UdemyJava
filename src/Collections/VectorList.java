package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) 
	{
		Vector<String> v1= new Vector<String>();
		v1.add("sai");
		v1.add("padala");
		
		System.out.println(v1);
		
		Vector<String> v2= new Vector<String>();
		v2.add("durga");
		v2.add("kovvuri");
		
		System.out.println(v2);
		// collection.addAll(collection)
		v1.addAll(0,v2);
		
		System.out.println(v1);
		
		// containsAll takes object and contains take string as input
		System.out.println(v1.containsAll(v2)); // returns true or false
		
		/////////////////////////////////////////////////////////////////////////////
		
		// to convert a list to array
		Object[] arr= v1.toArray();
		System.out.println(Arrays.toString(arr));
		
		// to convert array to list
		List<Object> list=Arrays.asList(arr);
		System.out.println(list);
		

	}
	
	// the default value of any object is null( for string also , the default value is null)
	// intial capacity is 10.
	// it doubles the capacity of the array when the 11 th element is added.
	// set method will update the data and add method will keep the data at 1 st position and the remianing data will be shifted to right.
	
	

}
