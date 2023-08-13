package Array;

public class SumArray 
{
	public static void main(String[] args)
	{
		int a[]= {10,17,30,40};
		int sum=0;
		
//		for(int i=0;i<a.length;i++)
//		{
//			sum=sum+a[i];
//		    if(a[i]%2==0)
//		    {
//			    System.out.println(a[i]);
//		    }
//		}
		
	for(int j:a)
	{
		sum=sum+j;
		if(j%2==0)
		{
			System.out.println(j);
		}
	}
	System.out.println(sum);
	}

}
