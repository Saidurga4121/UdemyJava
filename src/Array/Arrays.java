package Array;

public class Arrays {
	
	public static void main(String[] args)
	{
		int a[]= new int[5];	
		// int a[]= {10,20,30,40,50};
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);		
//		}
		
		// a contains all the values and i will start from 0, and will loop till the end of a 
		for(int i:a)
		{
			System.out.println(i); 
		}
	}

}
