package Programs;

public class PalindromeInSentence {

	public static void main(String[] args) 
	{
		String s="my name is nitin and i am from malayalam";
		
	}
	
//	public static boolean isPalindrome(String str)
//	{  
//	    StringBuilder sb=new StringBuilder(str);  
//	    sb.reverse();  
//	    String rev=sb.toString();  
//	    if(str.equals(rev))
//	    {  
//	        return true;  
//	    }
//	    else
//	    {  
//	        return false;  
//	    }  
//	}  
	
	public static boolean isPalindrome(String input)
	{
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			int a=0;
			int b=input.length()-1;
			while(b>a)
			{
				if(input.charAt(a)!=input.charAt(b))
				{
					// the return will come out of the method with the returned value. 
					return false;
				}
				a++;
				b--;
			}
//			boolean flag=isPalindrome(arr[i]);
//			if(flag)
//			{
//				System.out.println(arr[i] + " is palindrome");
//			}
//			else
//			{
//				// System.out.println("do nothing");
//			}
		}
		
		return true;
	}

}
