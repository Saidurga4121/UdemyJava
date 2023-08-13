package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets 
{
//	public static void main(String[] args)
//	{
//		// linked will give how u entered.
//		// hash set will give random order
//		// TreeSet will sorted order.
//		SortedSet<Object> set=new TreeSet<Object>();
//		// we cannot sort heterogeneous set
//		// TreeSet is sorted, it cannot sort String and Integer together
//		// set.add("sai");
//		set.add(2);
//		set.add(8);
//		set.add(7);
//		set.add(3);
//		set.add(100);
//		set.add(266);
//		set.add(27);
//		set.add(27);
//		set.add(30);
//		//
//		System.out.println(set);
//		
//		////the below methods will be there only in tree set////
//		// will give the first element
//		System.out.println(set.first());
//		System.out.println(set.last());
//		System.out.println(set.headSet(3)); // will give the sorted order before 3
//		System.out.println(set.tailSet(3)); // will give the sorted set after 3
//		System.out.println(set.subSet(2, 7)); // including 2 and excluding 7 ...will give the middle values
//	}
	public static void main(String[] args)
	{
		Set<String> mobileset = new HashSet<String>();
		mobileset.add("Apple");
		mobileset.add("Orange");
		mobileset.add("Banana");
	    System.out.println(mobileset);
	    
	    Object[] obj=mobileset.toArray();
	    for(int i=0;i<obj.length;i++)
	    {
	    	System.out.println(obj[i].toString());
	    }
	    
	    
	    
	    
	    // converting set to array
//	    String[] mobileArray= new String[mobileset.size()];
//	    String[] mobiles=mobileset.toArray(mobileArray);
//	    for(int i=0;i<mobiles.length;i++)
//	    {
//	        System.out.println(mobiles[i]);
//	    }  
	      
	      
	}

}
