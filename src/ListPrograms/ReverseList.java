package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList 
{
	public static void main(String[] args) 
	{
		List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9,1);  // Collections.reverse(list1);
		List<Integer> newList1= new ArrayList<>();
		int rev1=0;
		//
		for(int i=list1.size()-1;i>=0;i--)
		{
			rev1=rev1+list1.get(i);
			newList1.add(rev1);
			rev1=0;
		}
		System.out.println(newList1);
		
		List<String> list= Arrays.asList("PLATFORM", "LEARNING",  "BEST", "THE", "IS", "GFG");
		List<String> newList= new ArrayList<>();
		String rev="";
		//
		for(int i=list.size()-1;i>=0;i--)
		{
			rev=rev+list.get(i);
			rev=rev+" ";
		}
		newList.add(rev);
		System.out.println(newList);
		
	}

}
