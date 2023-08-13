package GenericStrings;

public class SwapFirstLastletters 
{
	public static void main(String[] args) 
	{
		String s="iam red seed";
		        //mai der dees
		String[] arr=s.split(" ");
		String s2="";
		//
		for(int i=0;i<arr.length;i++)
		{
			char first=arr[i].charAt(0);
			char last=arr[i].charAt(arr[i].length()-1);
			s2=s2+last+arr[i].substring(1,arr[i].length()-1)+first;
			s2=s2+" ";
		}
		
		System.out.println(s2);
		
		
	}

}
