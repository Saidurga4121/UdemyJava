package CodeWars;

public class LongestConsec {

	public static void main(String[] args) {
		String[] arr = { "tree", "foling", "trashy", "blue", "abcdef", "uvwxyz" };
		System.out.println(longestConsec(arr, 2));

	}

	public static String longestConsec1(String[] strarr, int k)
	{
		int maxSum = 0;
		int start = 0;
		int end = 0;
		String text = "";
		if (!(strarr.length == 0 || k > strarr.length || k <= 0))
		{
			for (int i = 0; i <= strarr.length - k; i++)
			{
				int sum = 0;
				for (int j = i; j < i + k; j++)
				{
					sum += strarr[j].length();
				}
				if (sum > maxSum)
				{
					maxSum = sum;
					start = i;
					end = i + k;
				}
			}
			for (int c = start; c < end; c++)
			{
				text += strarr[c];
			}
		}
		return text;
	}

	public static String longestConsec(String[] arr, int k) {
		int sum = 0;
		int pos = 0;
		int largest = 0;
		int index = 0;
		String str="";
		for (int i = 0; i < arr.length; i++)
		{
			String result = "";
			if (i != arr.length - 1) 
			{
				result = result + arr[i] + arr[i + 1];
				//
				for (int j = 0; j < result.length(); j++)
				{
					char ch = result.charAt(j);
					pos = ch - 'a' + 1;
					sum = sum + pos;

				}
				/// System.out.println(sum + " "+ result);
				if (largest < sum)
				{
					largest = sum;
					index = i;
					str=result;
				}
			}
		}
		return str;

	}

}
