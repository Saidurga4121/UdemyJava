package CodeWars;

public class Piglatin {

	public static void main(String[] args)
	{
		String s="Pig latin is cool !";
		String result="";
		//
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String first=arr[i].substring(1,arr[i].length());
			String second=arr[i].substring(0,1);
			if(!arr[i].contains("!"))
			{
		     	result=result+first+second+"ay"+" ";
			}
			else
			{
				result=result+"!";
			}
		}
		System.out.println(result);

	}

}
