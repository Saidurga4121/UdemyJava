package Programs;

public class DivisionWithoutUsingOperator {

	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
		int result=0;
		//
//		int c=a+b;
//		while(c>b)
//		{
//			c=c-b;
//			result++;
//		}
//		System.out.println(result);
		
		while(a>=b)               
		{
			a=a-b;   
			result=result+1;  
		}
		System.out.println(result);	
		
		
		

	}

}
