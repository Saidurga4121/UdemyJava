package Programs;

public class PrintLetters 
{
	public static void main(String[] args)
	{
		String s="ABC1234xyz";
	    char[] ch=s.toCharArray();  
	    for(int i=0;i<s.length();i++)
	    {
	    
	        if(ch[i]>='a' && ch[i]<='z' && ch[i]>='A' && ch[i]<='Z')
	        {
	            System.out.print(ch[i]);
	        }
	    }
	}
}
