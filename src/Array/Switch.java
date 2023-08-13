package Array;

public class Switch 
{
//	public static void main(String[] args)
//	{
//		while1();
//		int day=12;
//		switch(day)
//		{
//			case 1:
//				System.out.println("sunday");
//				break;
//			case 2:
//				System.out.println("monday");
//				break;
//			default:
//				System.out.println("i will get executed only when all the cases fails");
//		}
//		
//	}
	
//	public static void main(String[] args)
//	{
//		System.out.println("enter the loop");
//		int i=1;
//		while(i<10)
//		{
//			System.out.println(i);
//			i++;
//		}
//	}
	
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==7)
			{
				// it will break the if statement and will come out of for loop(will not continue the loop further)
				 break; 
				// will continue the loop after 5 ...will not execute for 5 alone
				// continue;
			}
			System.out.println(i);
		}
		System.out.println("iam out of for loop");
	}

}
