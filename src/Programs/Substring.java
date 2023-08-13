package Programs;

public class Substring {

	public static void main(String[] args) 
	{
		String cities = "Hyderabad,Pune,Chennai,Gujarath,Bangalore,Nodia";
		for(int i=0;i<cities.length();i++)
		{
			int index=cities.indexOf(",");
			System.out.println(index);
			// last digit will be excluded.
			String s2=cities.substring(0, index);
			System.out.println("the cities are " + s2);
			cities=cities.substring(index+1);
		}

    }	

}
