package CodeWars;

public class LongestPalindrome {

	public static void main(String[] args)
	{
		String s="baablkj12345432133d";
		System.out.println(longestPalindrome(s));
	}

	public static int longestPalindrome(final String s)
	{
		String[] arr=s.split(" ");
		boolean flag = false;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int a=0;
			int b=arr[i].length()-1;
			while(b>a)
			{
				if(arr[i].charAt(a)!=arr[i].charAt(b))
				{
					flag=false;
				}
				else
				{
					flag=true;
				}
				a++;
				b--;	
			}
			if(flag)
			{
				System.out.println(arr[i] + " is palindrome");
				count=arr[i].length();
			}			
		}
        return count;
    }

}
