package Programs;

public class CountTheDigitsInNumber {

	public static void main(String[] args) 
	{
		int i=12345;
		
//		String s=Integer.toString(i);
//		System.out.println(s.length());
		int count=0;
		while(i>0)
		{
			i=i/10;
			// System.out.println(i);
			count++;
		}
		System.out.println(count);

	}

}
