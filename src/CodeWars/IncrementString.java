package CodeWars;

public class IncrementString {

	public static void main(String[] args)
	{
		String s="foobar000";
		System.out.println(incrementString(s));
		
	}
	
	 public static String incrementString(String s)
	 {
		 String result="";		
			//
			for(int i=0;i<s.length();i++)
			{
				if(!Character.isDigit(s.charAt(i)))
				{
					result=s+1;
				}
				else
				{
					if(s.charAt(i)>=0 || s.charAt(i)<=9)
					{
						if(s.charAt(i)==0)
						{
							
						}
						String sum=String.valueOf(Integer.parseInt(s.substring(i,s.length()))+1);
						result=s.substring(0,i)+sum;
					    break;
					}
				}
			}
		return result;
	 }

}
