package Programs;

public class PrintOneSpace {

	public static void main(String[] args) 
	{
		String s1="My   name    is      sai";
		System.out.println(s1.replaceAll("\\s+" , " ").trim());
		String s2="";
		//
		String[] arr=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!="")
			{
				s2=s2+arr[i];
				s2=s2+" ";
			}
			
		}
		System.out.println(s2);

	}

}
