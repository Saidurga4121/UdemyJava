package Programs;

public class DuplicateLetters {

	public static void main(String[] args) 
	{
		String s="kartheek sai akeeee";
		//
		char[] ch=s.toCharArray();
		//
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0' )
			{
			     System.out.println(ch[i] + " reapeated for " + count);
			}
		}
	}

}
