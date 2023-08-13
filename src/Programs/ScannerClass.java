package Programs;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("hello " + name);
		
	}

}
