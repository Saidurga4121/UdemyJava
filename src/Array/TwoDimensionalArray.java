package Array;

public class TwoDimensionalArray 
{
	public static void main(String[] args)
	{
//		int a[][]= new int[3][2];
//		//
//		a[0][0]=00;
//		a[0][1]=01;
//		
//		a[1][0]=10;
//		a[1][1]=11;
//		
//		a[2][0]=20;
//		a[2][1]=21;
		
		int a[][]= { {00,01}, {10,11},  {20,21} };
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int i[]:a)
		{
			for(int r:i)
			{
				System.out.println(r);
			}
		}
	}

}
