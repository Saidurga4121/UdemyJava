package ListPrograms;

import java.util.Arrays;
import java.util.List;

public class PrintNonRepeatingCharacters {

	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(1,2,2,3,2);
		//
		for(int i=0;i<list.size();i++)
		{
			int x=list.get(i);
			int count=0;
			for(int j=0;j<list.size();j++)
			{
				if(x==list.get(j))
				{
					count++;
				}
				else
				{
					break;    // will print the first non repeating number only since it will break the loop as soon as it finds
				}
			}
			if(count==1)
			{
				System.out.println(list.get(i));
			}
		}

	}

}
