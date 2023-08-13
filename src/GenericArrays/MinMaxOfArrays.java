package GenericArrays;

public class MinMaxOfArrays 
{
	public static void main(String[] args) 
	{
		int arr[]= {100,200,30,50,40};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
