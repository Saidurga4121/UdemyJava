package GenericStrings;

public class Print3LetterWord 
{
	public static void main(String[] args)
	{
//		String s="Iam saied durgaed";
//		String[] arr=s.split(" ");
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i].endsWith("d"))
//			{
//				System.out.println(arr[i]);
//			}
//		}
		
//		String s1="Iam red seed";
//		s1=s1.replace("red","");
//		System.out.println(s1);
//		
		
		String s1="IAM red SEED";
		String s2="";
		String[] arr=s1.split(" ");
		//
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length();j++)
			{
				if(i%2==0)
				{
					s2=s2+Character.toLowerCase(arr[i].charAt(j));
				}
				else
				{
					s2=s2+Character.toUpperCase(arr[i].charAt(j));
				}
			}
			s2=s2+" ";
			
		}
		System.out.println(s2);
		
		
	}

}
