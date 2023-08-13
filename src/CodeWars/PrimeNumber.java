package CodeWars;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int n=211;
		System.out.println(isPrime(n));

	}
	public static boolean isPrime(int num)
	{
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num<=0)
			{
				return false;
			}
			if(num%i==0)
			{
				flag=false;
				break;
			}
			else
			{
				flag=true;
			}
		}		
	    return flag; 
	}

}
