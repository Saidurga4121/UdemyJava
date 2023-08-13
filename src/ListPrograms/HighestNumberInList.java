package ListPrograms;

import java.util.Arrays;
import java.util.List;

public class HighestNumberInList {

	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(1,2,3,9,5,7,9,6,9);
		int largest=list.get(0);
		//
		for(int i=0;i<list.size();i++)
		{
			if(largest<list.get(i))
			{
				largest=list.get(i);
			}
		}
		System.out.println(largest);

	}

}
