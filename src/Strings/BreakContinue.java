package Strings;

public class BreakContinue {

	public static void main(String[] args)
	{
		int[] a= {1,2,3,1,2,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			if(i==3)
			{
				// as soon as the continue got executed , the if loop will be terminated and the for loop continue with the next iteration
				continue;
			}
			else if(i==4)
			{
				// as soon as the break gets executed, the for loop will be terminated and the control will come out of the for loop.
				break;
			}
			System.out.println(i);
		}
		

	}

}
