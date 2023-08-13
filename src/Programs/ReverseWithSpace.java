package Programs;

public class ReverseWithSpace 
{
		public static void main(String[] args)
		{
			String s1="abc def";
			String[] arr=s1.split(" ");
			String s2="";
			//
			for(int i=0;i<arr.length;i++)
			{
				for(int j=arr[i].length()-1;j>=0;j--)
				{
					s2=s2+arr[i].charAt(j);
				}
				s2=s2+" ";
			}
			System.out.println(s2);

		}
		
		
		
		
		
		
	}


