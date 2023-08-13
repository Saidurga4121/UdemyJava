package Array;

public class MissingNumber 
{
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,7,8,9};
		//          0 1 2 3 4 5 6
		int sum =0;
		int n=arr.length+1;
		int sum1=(n*(n+1))/2;
		int diff=arr[0]-0; // 1
		//
//		for(int i = 0; i < arr.length; i++)
//	    { 
//	        if (arr[i] - i != diff)
//	        {           
//	            while (diff < arr[i] - i)
//	            {
//	                System.out.print((i + diff) + " "); //5
//	                diff++;
//	            }
//	        }
//	    }
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int result=sum1-sum;
		System.out.println(result);
	
	}

}
