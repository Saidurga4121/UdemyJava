package CodeWars;

import java.util.Arrays;

public class Persistence {

	public static void main(String[] args) {
		long n =999;
		int result = persistence(n);
		System.out.println(result);
	}

	public static int persistence(long n)
	{
		String str=String.valueOf(n);
		int count=0;
		int checkNum=1;
		if(str.length()>1)
		{
			while(true)
			{
				for(int i=0;i<str.length();i++)
				{
					checkNum=checkNum*Integer.parseInt(str.substring(i,i+1));
				}
				count++;
				str=String.valueOf(checkNum);
				checkNum=1;
				if(str.length()==1)
				{
					break;
				}
			}
		}
		return count;
	}
}
