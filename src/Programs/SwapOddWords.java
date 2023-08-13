package Programs;

public class SwapOddWords {
	
	// 0  1  2   3
	// i am sai durga
	// i durga sai am 
	public static void main(String[] args) 
	{
		String s1="i am sai durga";
		String[] arr=s1.split(" ");
		String temp;
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i] + " ");
			}	
		}
		

	}

}
