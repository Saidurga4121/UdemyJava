package Programs;
public class CamelCase {

	public static void main(String[] args)
	{
		String s="cose?camel";
		camelCase(s);

	}
	public static String camelCase(String s)
	{
		// stripleading() removes the spaces at the beginning of the string. 
		// striptrailing() removes the spaces at the end of the string
        // \\s means ..if it finds space ..then it will replace with 0
		// \\s+ means..if it finds multiple spaces ..all multiple spaces wil be replaced with one 0.
		if(s.isEmpty())
		{
			return "";
		}
		//String str=s.replaceAll("\\s+"," ").trim();
		// String[] arr = s.trim().split(" +");
		
		// IN JAVA WE CAN SPLIT BY USING . BUT SINCE . IS A CHARACTER ,JAVA WILL IDENTIFY ONLY WHEN WRITTEN IN \\ OR []
		String[] arr=s.split("\\?");
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"0");
			result += arr[i].substring(0, 1).toUpperCase();
			result += arr[i].substring(1,arr[i].length());
//			if(Character.isLowerCase(arr[i].charAt(0)))
//			{
//				result=result+String.valueOf(Character.toUpperCase(arr[i].charAt(0)));
//			}
//			for(int j=0;j<arr[i].length();j++)
//			{
//				if(j!=0)
//				result=result+arr[i].charAt(j);
//			}
			
		}
		
        return result;
    }

}
