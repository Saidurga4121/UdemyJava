package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Prime1To100
{
	public static void main(String[] args) 
	{
		List<Integer> list= new ArrayList<>();
		// adding prime to list
		for(int i=2;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				list.add(i);
			}
		}
		for(int i=0;i<list.size();i++)
		{
			String element=String.valueOf(list.get(i));
			// removing from list if the num is < 9
			if(element.length()==1)
			{
				list.remove(list.get(i));
				i--;
			}
			// removing the num if it is asymmetric.
			boolean flag = true;
		    for (int j = 1; j < element.length(); j++)
		    {
		       if (element.charAt(j) != element.charAt(0))
		       {
		          flag = false;
		          break;
		       }
			   if (flag)
			   {
			        list.remove(i);
			        i--;
			   }
		    }
		}
	}
}
	


