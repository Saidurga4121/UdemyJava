package Strings;

import java.util.Arrays;

public class ComparisionOfStrings {
	
	public static void main(String[] args)
	{
		// sai will located in string pool of heap.
		
		String a="sai";   // will be stored in string constant pool memory of heap
		String b="sai";
		
		//
		System.out.println(a==b); // true
		System.out.println(a.equals(b)); // true
		
		String s1= "durga";
		String s2= new String("durga");    // will be stored in the heap memory.
		                                   // every modification in a  string creates a new memory on the heap.
		
		System.out.println(s1==s2);    // false
		System.out.println(s1.equals(s2)); // true
		
		String s3= new String("abc");
		String s4= new String("abc");
		
		System.out.println(s3==s4);    // false
		System.out.println(s3.equals(s4)); // true
		
		// why string are immutable
		
		System.out.println(a.toUpperCase()); // SAI
		// a=a.toUpperCase();
		System.out.println(a);  // sai  // bcz strings are immutable
		
		String s5="Sai durga Padala";
		
		System.out.println(Arrays.toString(s5.toCharArray()));
		
		String[] arr=s5.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		

	}

}
