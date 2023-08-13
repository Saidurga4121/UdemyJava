package CodeWars;

public class EncryptThis {

	public static void main(String[] args)
	{
		String s="A wise man";
		
		System.out.println(encryptThis(s));
	}
	public static String encryptThis(String text)
	{
		String[] arr=text.split(" ");
		String finalResult = "";
		
		    if(text.isEmpty())
		    {
		    	return "";
		    }
			for(int i=0;i<arr.length;i++)
			{
				String second ="";
				String last ="";
				char ch=arr[i].charAt(0);
				int result=(int) (ch);
				if(arr[i].length()>1)
				{
					second=arr[i].replace(arr[i].charAt(1), arr[i].charAt(arr[i].length()-1));
					last=arr[i].replace(arr[i].charAt(arr[i].length()-1),arr[i].charAt(1));
			    }
				if(arr[i].length()>2)
				{
					finalResult=finalResult+result+""+arr[i].substring(1)+" ";
				}
				else
				{
					finalResult=finalResult+result+""+second.charAt(1)+arr[i].substring(2,arr[i].length()-1)+last.charAt(arr[i].length()-1)+" ";	
				}
		    }
        return finalResult;
    }

}
