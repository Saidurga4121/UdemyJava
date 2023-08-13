package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsonantValue {

	public static void main(String[] args) 
	{
		String s="strength";
		System.out.println(solve(s));
		
	}
	public static int solve(final String s) 
	{
		String res=s.replaceAll("[aeiou]", "0");
		List<Integer> list= new ArrayList<>();
		String[] arr=res.split("0");
		int largest=0;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length();j++)
			{
				char ch=arr[i].charAt(j);
				int pos=ch-'a'+1;
				sum=sum+pos;
			}
//			if(sum > largest)
//			{
//				largest = sum;
//			}
			list.add(sum);			
		    Collections.sort(list);
		}
        // return largest;
		return list.get(list.size()-1);
    }

}
