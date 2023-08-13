package Programs;
import java.util.Arrays;


public class WhereIsMyParent
{
	public static void main(String[] args)
	{
		String text="xXfuUuuF";
		          //   xxfuuuf
		System.out.println(findChildren(text));
	}
//	static String findChildren(String text)
//	{
//		char[] ch=text.toCharArray();
//		Arrays.sort(ch);
//		String lower="";
//		String upper="";
//		String result="";
//		if(text.isEmpty())
//		{
//			return "";
//		}
//		for(int i=0;i<ch.length;i++)
//		{
//			if(Character.isLowerCase(ch[i]))
//			{
//				lower=lower+ch[i];
//			}
//			else
//			{
//				upper=upper+ch[i];
//			}
//		}
//		String res=upper+lower;
//		for(int i=0;i<upper.length();i++)
//		{
//			result+=res.charAt(i);
//			for(int j=0;j<res.length();j++)
//			{
//				int sum=res.charAt(j)-res.charAt(i);
//				if(sum==32)
//				{
//					result=result+""+res.charAt(j);
//				}
//			}
//		}
//        return result;
//    }
	
	static String findChildren(String text)
	{
		char[] ch=text.toLowerCase().toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++)
		{
			if(i==0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
			else 
			{ 
	           if (! ((""+ch[i-1]).equalsIgnoreCase(""+ch[i])))
	           {
	              ch[i]=Character.toUpperCase(ch[i]); 
	           }
	        }	
		}
		return new String(ch);
	}

}

