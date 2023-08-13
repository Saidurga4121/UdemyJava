package Programs;

public class VowelCount {

	public static void main(String[] args) 
	{
		String s="SAI DURGA";
		int result=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				result++;
				count=1;
			}
			if(count==1)
			{
			   System.out.println(result + " " + ch);
			}
			count=0;
		}
		
		
		

	}

}
