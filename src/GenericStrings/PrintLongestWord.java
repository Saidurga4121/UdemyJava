package GenericStrings;

public class PrintLongestWord 
{
	public static void main(String[] args) 
	{
		String s="I am the string saidurga";
		String[] arr=s.split(" ");
		String largestString="";
		//
		for(int i=0;i<arr.length;i++)
		{
				 if(arr[i].length() > largestString.length())
				 {
					 largestString=arr[i];
				 }
		}
		System.out.println(largestString);
		  
		   
		}
	}
	
	


