package Programs;

public class ReverseRemove 
{
	public static void main(String[] args)
	{
		 String s="sa idd rgaz";
		 //
		 char[] ch=s.toCharArray();
		 char[] newArray= new char[ch.length];
		 int len=newArray.length-1;
		 //
		 // to preserve the positions
		 for(int i=0;i<s.length();i++)
		 {
			 if(ch[i]==' ')
			 {
				 newArray[i]= ' ';
			 }
		 }
		 // reversing the string
		 for(int i=0;i<s.length();i++)
		 {
			 if(ch[i]!=' ')
			 {
				 if(newArray[len]==' ')
				 {
					 len--;
				 }
				 newArray[len]=ch[i];
				 len--;
			 }
		 }
		 System.out.println(String.valueOf(newArray));
		 
	}

}
