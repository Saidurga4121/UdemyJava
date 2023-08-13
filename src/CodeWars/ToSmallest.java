package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToSmallest {

	public static void main(String[] args)
	{
		long n=285365; 
	//	       126235
		System.out.println(smallest(n));

	}
	public static long[] smallest(long n) {
        // this method will not work for negative n
        assert n >= 0;

        String s = "" + n;
        final int numDigits = s.length(); // 6

        String smallest = s;
        long smallesti = 0;
        long smallestj = 0;
        // 285365
        for (int i = 0; i < numDigits; i++) // 1
        {
            for (int j = 0; j < numDigits; j++) // 2
            {
                if (i == j)
                {
                	continue;
                }
                String first= s.substring(0,i);  // 2
                String second= s.substring(i+1); // 5365
                String s2 = first+second;  // 25365
                String third= s2.substring(0,j); // 25 // 253 // 2536 // 25365
                char fourth= s.charAt(i); // 8 
                String fifth=s2.substring(j); // 365 // 65 // 5 // null
                s2 = third + fourth + fifth;  // 825365 // 258365 //253865 // 253685 // 253658
                if (smallest.compareTo(s2) > 0)
                {
                    smallest = s2;
                    smallesti = i;
                    smallestj = j;
                }
            }
        }
        
        return new long[]{Long.valueOf(smallest), smallesti, smallestj};
    }

}
