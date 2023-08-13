package Array;

public class SearchingNumber 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int num=100;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
			{
				System.out.println("found "+ i+ " position");
				flag=true;
				break;
			}	
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}
		
		
//		for(int i:a)
//		{
//			if(num==i)
//			{
//				System.out.println("found "+ i+ " position");
//				break;
//			}
//		}
		
	}
}
