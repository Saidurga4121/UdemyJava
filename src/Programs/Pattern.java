package Programs;

public class Pattern 
{
	public static void main(String[] args)
	{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		     }
		     System.out.println();
	    }
		//		*
		//		* *
		//		* * *
		//		* * * *
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for(int i =1;i<=4;i++)
		{
			for(int j=4;j>=1;j--)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		     }
		     System.out.println();
	    }
		
		//		****
		//		*** 
		//		**  
		//		* 
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for(int i =4;i>=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		     }
		     System.out.println();
	    }
		
		//		       *
		//		     * *
		//		   * * *
		//		 * * * *
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
		     }
		     System.out.println();
	    }
		//		****
		//		 ***
		//		  **
		//		   *
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		int space=4;
		int star=1;
		for(int i=1;i<=9;i++)
		{
			for(int s=1;s<=space;s++)
			{
				System.out.print(" ");
			}
			for(int z=1;z<=star;z++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			if(i<=4)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print(i);
					System.out.print(i+1);
				}
				else
				{
					System.out.println(i);
				}
			}
		}
			
    }
	
	
	
// if no space ..
//	    #
//	   ##
//	  ###
//	 ####
	
//	    # 
//	   # # 
//	  # # # 
//	 # # # # 
	
	
	
}
