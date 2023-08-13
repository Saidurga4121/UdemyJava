package Strings;

public class SearchString 
{
	public static void main(String[] args)
	{
		String[] s= {"sai","durga","padala","kovvuri","kartheek"};
		boolean flag=false;
		//
//		for(int i=0;i<s.length;i++)
//		{
//			// System.out.println(s[i]);
//			if(s[i].equalsIgnoreCase("kartheek"))
//			{
//				System.out.println(i);
//			}
//		}
		
		for(String j : s)
		{
			if(j.equals("kovjvuri"))
			{
				flag=true;
				System.out.println(j);
				// in order to break the loop for kartheek ...we are using break here
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}
		
	}

}
