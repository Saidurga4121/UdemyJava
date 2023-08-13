package CodeWars;

public class SumOfNaturalNumbers {

	public static void main(String[] args) 
	{
		int n=10;
		solution(n);

	}
	
	public static int solution(int number) 
	{
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		return sum;
	}

}
