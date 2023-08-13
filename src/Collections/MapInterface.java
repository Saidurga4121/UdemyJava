package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
		Map<Integer,String> map= new HashMap<>();
		//
		map.put(101, "Hyderabad");
		map.put(102, "Bangalore");
		map.put(103, "Chennai");
		map.put(104, "Mumbai");
		map.put(105, "Delhi");
		
		// to fetch all the keys
		// the return type is set bcz set doesnt allow duplicates and keys are not duplicate
		Set<Integer> keys=map.keySet();
		for(int i: keys)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		// to fetch all the values
		// the return type is collection bcz values can have duplicates as well.. thats why it is not set.
		Collection<String> values=map.values();
		for(String e: values)
		{
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println(map.get(101));
		System.out.println();
		
		for(int i:keys)
		{
			System.out.println(i + "----" + map.get(i));
		}
		
		map.remove(101);
		
		System.out.println(map);
		
		// verification of keys and values
		System.out.println(map.containsKey(101));     // false
		System.out.println(map.containsValue("Hyd")); // false
		
		// to update the value (we can use put by reinserting or we can update by using replace)
		// map.put(102, "Madurai");
		
		map.putIfAbsent(102, "Madhurai"); 
		map.replace(103, "AB");
		System.out.println(map);
		
	    // TO KNOW THE SIZE
		map.size();
		
		// to get the entries( how many rows are there)
		System.out.println();
		
		// the return type is set bcz the duplicates entries are not allowed.
		// entry set returns the pair
		Set<Entry<Integer, String>> entries=map.entrySet();
		for (Entry<Integer, String> entry : entries)
		{
			// getkey will get the value of key for a specific entry(pair)
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key + "------"+value);
		}
		
		// doesnt allow duplicates keys but allows duplicate values.
		// may have one null key and can have multiple null values.
		// contains only unique elements.
		// there is no concept of indexing in maps ..we can use keys to get the values
		// map.get(key)--->returns values.

	}

}
