package CodeWars;

import java.util.Arrays;

public class CaptializeWords {

	public static void main(String[] args) {
		String s = "The_stealth-warrior";
		//
		String[] arr = s.split("[_\\-]");
		String str1 = arr[0];
		//
		for(int i=1;i<arr.length;i++)
		{
			str1=str1+arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase();
		}
		System.out.println(str1);
		

		
	}
}
