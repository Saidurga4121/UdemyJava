package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeList 
{
	public static void main(String[] args) 
	{
		List<String> firstlist =Arrays.asList("padala", "Sai");
		List<String> secondlist =Arrays.asList("durga", "kartheek", "kovvuri");
		//
		List<String> list= new ArrayList<String>();
		list.addAll(firstlist);
		list.addAll(secondlist);
		System.out.println(list);
		
		
	}

}
