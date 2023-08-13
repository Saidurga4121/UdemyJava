package Programs;

public class DuplicateWords {

	public static void main(String[] args)
	{
		String str = "kartheek sai kartheek sai sowmya";
		
		String[] split=str.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			int count=1;
			for(int j=i+1;j<split.length;j++)
			{
				if(split[i].equalsIgnoreCase(split[j]) && split[i]!=" ")
				{
					count++;
					split[j]="0";
				}
			}
			if(count>1 && split[i]!="0")
			{
				System.out.println(count + " repeated for " + split[i]);
			}
		}
		
		
		
		
		

	}

}
