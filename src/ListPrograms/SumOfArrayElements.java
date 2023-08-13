package ListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArrayElements {

	public static void main(String[] args) 
	{
	    List<Integer> list= Arrays.asList(7,20,30,79);
	    int sum=0;
	    int evenSum=0;
	    int avg=0;
	    System.out.println(list);
	    for(int i=0;i<list.size();i++)
	    {    	
	    	int result=list.get(i);
	    	if(result%2==0)
	    	{
	    		evenSum=evenSum+list.get(i);
	    	}
	    	sum=sum+list.get(i);
	    	avg=sum/list.size();
	    	
	    }
	    System.out.println(sum);
	    System.out.println(avg);
	    System.out.println(evenSum);
	    

	}

}
