package Programs;

public class Fibonacci {

	// 0  1  1 2 3 5 8
	// n1 n2 n3
	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3;
		int count=10;
		System.out.print(n1 + " " +n2);
		
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.print(" " +n3);
			n1=n2;  
			n2=n3;
		}
		
		
	}

}
