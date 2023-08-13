package CodeWars;

public class ParityCheck {

	public static void main(String[] args)
	{
		int[] a= {160, 36, 1710, 19, 11, 13, -21};		
		System.out.println(find(a));
	}
	static int find(int[] a)
	{
		int evenCount=0;
		int oddCount=0;
		int even=0;
		int odd=0;
				
		for(int i=0;i<a.length;i++)
		{
            if(a[i] % 2 == 0)
            {
                even = a[i];
                evenCount++;
            }
            else 
            {
                odd = a[i];
                oddCount++;
            }
        }       
        if(oddCount > evenCount)
        {
            return even;
        } 
        else
        {
        	return odd;
        }

	}

}
