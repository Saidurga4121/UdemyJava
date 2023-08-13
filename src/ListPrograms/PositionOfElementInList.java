package ListPrograms;

import java.util.Arrays;
import java.util.List;

public class PositionOfElementInList {

	public static void main(String[] args) 
	{
		List<String> list= Arrays.asList("padala","Sai","Sai","padala","kartheek","padala","kartheek","kartheek","Sai");
        //
//		for(int i=0;i<list.size();i++)
//		{
//			if(list.get(i).equals("padala"))
//			{
//				System.out.println(i);
//				break;
//			}
//		}
		
		for(String e: list)
		{
			if(e.equals("padala"))
			{
				System.out.println(e.indexOf("padala"));
			}
		}

	}

}
