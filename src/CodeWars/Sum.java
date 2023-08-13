package CodeWars;

public class Sum 
{
	public static int getSum(int a, int b)
    {
	   int sum=0;
       if(a<b)
       {
          for(int i=a;i<=b;i++)
          {
        	 sum=sum+i; 
          }
       }
       else if(a>b)
       {
          for(int i=b;i<=a;i++)
          {
        	 sum=sum+i; 
          }
       }
       else
       {
    	   return a;
       }
       
     return sum;
    }

	public static void main(String[] args) {
		int a = -1;
		int b = 1;
		int sum=getSum(a, b);
		System.out.println(sum);
	}

}
