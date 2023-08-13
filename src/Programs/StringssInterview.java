package Programs;

public class StringssInterview 
{
	static String s="sa idd rgaz";
	public static void main(String[] args)
	{
		//
		char ch[]=s.toCharArray();
		char[] newArray= new char[ch.length];
		int j=newArray.length-1;
		//
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				newArray[i]='0';
			}
		}
		for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] != ' ') 
            {                        
            	if(newArray[j] == '0')
                {
                    j--;
                }
                newArray[j] = ch[i]; 
                j--;
            }
        }
		System.out.println(String.valueOf(newArray)+ " iam the new array");
	    System.out.println(newArray);
	}

}
