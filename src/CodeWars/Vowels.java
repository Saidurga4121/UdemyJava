package CodeWars;

public class Vowels 
{
	public static int getCount(String str) 
	  {
	    char[] arr=str.toCharArray();
	    int count=0;
	    for(int i=0;i<arr.length;i++)
	    {
	      if(arr[i]==('a') || arr[i]==('e')|| arr[i]==('i')||arr[i]==('o')||arr[i]==('u'))
	      count++;
	     }
	    return count;
	  }
	  
	  public static void main(String[] args)
	  {
	    String str="sai durga";
	    int count=getCount(str);
	    System.out.println(count);
	  }

}
