package CodeWars;

public class FindEvenIndex {

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
		           // 0  1  2  3  4  5  6
		System.out.println(findEvenIndex(arr));
	}

	public static int findEvenIndex(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (leftSum(arr, i) == rightSum(arr, i))
			{
				return i;
			}	
		}
		return -1;
	}

	// 1, 2, 3, 4, 3, 2, 1 
    // 0  1  2  3  4  5  6
	public static long leftSum(int[] arr, int idx)
	{
		long result = 0;
		for (int i = 0; i < idx; i++)
		{
			result += arr[i];
		}
		return result;
	}

	public static long rightSum(int[] arr, int idx)
	{
		long result = 0;
		for (int i = idx + 1; i < arr.length; i++)
		{
			result += arr[i];
		}
		return result;
	}

}
