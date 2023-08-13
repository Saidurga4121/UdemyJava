package CodeWars;

import java.util.Scanner;

public class MiddlePermutation
{
	public static void main(String[] args)
	{
	    String str="abc";
	    System.out.println(reverse(str));
	}
       public static boolean reverse(String str) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String result="";
        for(int i=str.length();i>=0;i--)
        {
            result=result+""+str.charAt(i);
        }
        System.out.print(result);
        if(result.equalsIgnoreCase(str))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
                
    }
	public static boolean solve(String curr, String rem)
	{
	    if (rem.length() == 0)
	    { 
		    System.out.print(curr + " ");
			return false;
	    }
	    for (int i = 0; i < rem.length(); i++)
	    {
	    	String first=rem.substring(0, i);
	    	System.out.println(first);
	    	String sec=rem.substring(i + 1);
	    	System.out.println(sec);
		    String ros = first+sec;
		    solve(curr + rem.charAt(i), ros);
		    System.out.println(rem.charAt(i)+ " "+ ros);
	    }
		return false;
	 }

	 

}
