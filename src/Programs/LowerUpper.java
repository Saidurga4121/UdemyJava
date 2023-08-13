package Programs;

public class LowerUpper {

	public static void main(String[] args) 
	{
		String s="i am in capgemini i am in capgemini";
		//
		int mid=s.length()/2;
		String lower="";
		String upper="";
		for(int i=0;i<s.length();i++)
		{
			if(i<mid)
			{
				lower=lower+Character.toLowerCase(s.charAt(i));
			}
			else
			{
				upper=upper+Character.toUpperCase(s.charAt(i));
			}
		}
		//System.out.println(lower+upper);
		
		//
		String first=s.substring(0,s.length()/2);
		String second=s.substring(s.length()/2);
		String result="";
		result=first.toLowerCase();
		result=result+second.toUpperCase();
		System.out.println(result);
		
		int i=12345;
		String s1=Integer.toString(i);
		System.out.println(s1.length());
		
		
		
		
		
		

	}

}
