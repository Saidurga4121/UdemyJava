package GenericArrays;

public class SquareRootCubeRoot 
{
	public static void main(String[] args) 
	{
		int a[]= {10,3,2,4,5};
		//
		double first[]= new double[a.length];
		double second[]= new double[a.length];
		//
		for(int i=0;i<a.length;i++)
		{
			first[i]=Math.sqrt(a[i]);
			second[i]=Math.pow(a[i], 3);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(first[i]+ " " + second[i]);
			
		}
		
		
		
	}

}
