package CodeWars;

import java.util.Arrays;

public class ConsecutiveDuplicate {

	public static void main(String[] args)
	{
		String[] s= {"abracadabra","allottee","assessee"};
		System.out.println(dup(s));
	}
	public static String[] dup(String[] arr)
	{ 
		for(int i=0;i<arr.length;i++)
		{
			String result="";
			for(int j=0;j<arr[i].length()-1;j++)
			{
				if(arr[i].charAt(j)!=arr[i].charAt(j+1))
				{
					result=result+""+arr[i].charAt(j);
				}
			}
			arr[i]=result+""+arr[i].charAt(arr[i].length()-1);
		}
		System.out.println(Arrays.toString(arr));
	    return arr ; 

    }

}
