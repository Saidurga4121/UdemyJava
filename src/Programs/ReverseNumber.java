package Programs;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int data=12345678;
		int rev=0;
		int rem;
		while(data!=0)
		{
			rem=data%10;
			rev=rev*10+rem;
			data=data/10;
		}
		System.out.println(rev);
	}

}
