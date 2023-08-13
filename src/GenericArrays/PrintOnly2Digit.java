package GenericArrays;

public class PrintOnly2Digit 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,2,30,40,5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<100)
			{
				//System.out.println(arr[i]);
			    System.out.printf("%.2f\n",Math.sqrt(arr[i]));
			    System.out.println();
			    System.out.printf("%.2f\n",Math.pow(arr[i], 3));
			}
		}
		
	}

}
