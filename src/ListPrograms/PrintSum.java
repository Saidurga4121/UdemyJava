package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintSum {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,1,2,3,5);
		List<Integer> list1= new ArrayList<>();
		Set<Integer> set= new HashSet<>();
		int sum=0;
		int sum1=0;
		//
		// sum of repeating numbers
		list1=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toList());
		System.out.println(list1); // [1, 2, 3, 1, 2, 3]
		//
//		for(int i=0;i<list1.size();i++)
//		{
//			sum=sum+list.get(i);
//		}
//		System.out.println(sum);
		
		for(int i: list1)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		// sum of original numbers
		set=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
        System.out.println(set);   // [1, 2, 3]
        
        
        // find original numbers and add up
        for(int k:list)
        {
        	if(set.contains(k))
        	{
        		list1.add(k);
        	}
        	else
        	{
        		set.add(k);
        	}
        }
        System.out.println(set); // [1, 2, 3, 4, 5]
        
        for(int add:set)
        {
        	sum1=sum1+add;
        }
        System.out.println(sum1); // 15
        
	}

}
