package CodeWars;

public class Tribonacci {

	public static void main(String[] args) 
	{
		String[] arr= {"1","1","1"};
		int a=1;
		int b=1;          
		int c=1;			 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		for(int i=3;i<=20;i++)
		{
			int result=a+b+c;
			System.out.println(result);
			a=b;
			b=c;
			c=result;
			result=c;
				
		}
		
		

	}

}
