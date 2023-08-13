package Array;

public class LargestSmallest 
{
	public static void main(String[] args)
	{
		int a[]= {100,20,300,40000};
		//
		int largest=a[0];
		int smallest=a[0];
		//
		for(int i=1;i<a.length;i++)
		{
			if(largest<a[i])
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
		
		for(int j=1;j<a.length;j++)
		{
			if(smallest>a[j])
			{
				smallest=a[j];
			}
		}
		System.out.println(smallest);
		
	}

}
