package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alphabetical {

	public static void main(String[] args) 
	{
		String s = "Alexis:Wahl;"
				+ "John:Bell;"
				+ "Victoria:Schwarz;"
				+ "Abba:Dorny;"
				+ "Grace:Meta;"
				+ "Ann:Arno;"
				+ "Madison:STAN;"
				+ "Alex:Cornwell;"
				+ "Lewis:Kern;"
				+ "Megan:Stan;"
				+ "Alex:Korn";
		System.out.println(meeting(s));
	}
	public static String meeting(String s) 
	{
        String[] guests = s.split(";");
        for (int i = 0; i < guests.length; i++)
        {
            int index = guests[i].indexOf(":");
            guests[i] = "(" + guests[i].substring(index+1).toUpperCase() + ", " + guests[i].substring(0,index).toUpperCase() + ")";
        }
        Arrays.sort(guests);
        System.out.println(Arrays.toString(guests));
        return String.join("0",guests);
    }
	
	
	// juU6-wv?Ap9cg3hq

}
