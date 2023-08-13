package Strings;

import java.util.Arrays;

public class CapitalizeFirstLetter 
{
	public static void main(String[] args) 
	{
		String str="this is javatpoint";
		String words[]=str.split(" "); 
		String capitalizeWord="";
		//
		String toggleWord="";
		//
		for(int i=0;i<words.length;i++)
		{
			String firstLetter=words[i].substring(0,1);
			String afterFirst=words[i].substring(1);
			//
			capitalizeWord= capitalizeWord+firstLetter.toUpperCase()+afterFirst+ " ";
			//
			toggleWord=toggleWord+firstLetter+afterFirst.toUpperCase()+" ";
			
		}
		System.out.println(capitalizeWord);
		System.out.println(toggleWord);	
		
		
		
		String str2="this is javatpoint";
		String[] arr=str2.split(" ");
		String rev="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				rev=rev+arr[i].charAt(j);	
			}
			rev=rev+" ";	
		}
		// System.out.println(rev);
		// siht si tnioptavaj 
		// sIHT sI tNIOPTAVAJ
		String[] arr1=rev.split(" ");
		System.out.println(Arrays.toString(arr1));
		//
		String revWord="";
		//
		for(int i=0;i<arr1.length;i++)
		{
			String firstLetter=arr1[i].substring(0,1);
			String afterFirst=arr1[i].substring(1);
			//
			revWord= revWord+firstLetter+afterFirst.toUpperCase()+ " ";
			//
			
		}
		System.out.println(revWord);
		
		
		
		
		
//		String str2="this is javatpoint";
//		StringBuilder builder= new StringBuilder(str2);
//		String rev=builder.reverse().toString();
//		System.out.println(rev);
//		System.out.println(rev.equals(str2));
		
	}
}  


