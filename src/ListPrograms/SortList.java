package ListPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(4,1,8,4,8,0,5,8,1,8,6);  // Collections.sort(list); .. ascending order
//		Collections.sort(list,Collections.reverseOrder());
//		System.out.print(list +" ");
		
		//
		for(int i=0;i<list.size();i++)
		{
			int temp=0;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)<list.get(j))
				{
					temp=list.get(i);
					list.set(i,list.get(j)) ;
		            list.set(j,temp);
				}
			}
			System.out.print(list.get(i) +" ");
		}

	}

}
