package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitList {

	public static void main(String[] args) 
	{
		List<String> list= Arrays.asList("padala","Sai","durga","kartheek","kovvuri");
		List<String> firstlist =new ArrayList<>();
		List<String> secondlist =new ArrayList<>();
		int len=list.size();
		for(int i=0;i<len/2;i++)
		{
			firstlist.add(list.get(i));
		}
		for(int i=len/2;i<len;i++)
		{
			secondlist.add(list.get(i));
		}
		System.out.println(firstlist);
		System.out.println("**************");
		System.out.println(secondlist);
		

	}

}
