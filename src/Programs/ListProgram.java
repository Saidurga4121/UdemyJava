package Programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>(Arrays.asList("monday", "tuesday"));
		Collections.addAll(list, "wednesday", "thrusday", "friday", "saturday", "sunday");
		for (int i = 0; i < list.size(); i++) 
		{
			String day = list.get(i);
			if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) 
			{
				System.out.println("weekend");
			} 
			else 
			{
				System.out.println("week day");
			}

		}

	}
}
