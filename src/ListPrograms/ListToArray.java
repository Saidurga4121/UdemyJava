package ListPrograms;

import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) 
	{
		List<String> list= Arrays.asList("padala","Sai","Sai","padala","kartheek","padala","kartheek","kartheek","Sai");
        //
		String[] arr= new String[list.size()];
		//
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
		System.out.println(Arrays.toString(arr));
		
		// another way of converting list to array
		String[] arr1=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr1));

		
//		for(String x:arr1)
//		{
//			System.out.println(x);
//		}

		

	}

}
