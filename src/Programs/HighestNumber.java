package Programs;

public class HighestNumber 
{
	public static void main(String[] args)
	{
		int a[]= {10,-10,30,40};
		       // sl l
		       //    a[i]                   sl=10  lar=20   a[i]=40
		//
		int largest=a[0];
		int secondLargest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(largest>a[i])  // 10<20
			{
				secondLargest=largest; 
				largest=a[i]; 
			}
			else if(secondLargest>a[i])  
			{
				secondLargest=a[i];   
			}
		}
		System.out.println(secondLargest);
		System.out.println(largest);
	}

}
