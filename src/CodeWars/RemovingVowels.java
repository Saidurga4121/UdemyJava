package CodeWars;

public class RemovingVowels {

	public static void main(String[] args) {
		String s="This website is for losers LOL!";
		String str=disemvowel(s);
		System.out.println(str);

	}
	public static String disemvowel(String str)
	{
//		String s1="";
//		//
//		char[] ch=s.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{	
//			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
//			{
//				
//			}
//			else
//			{
//				s1=s1+str.charAt(i);
//			}
//			
//		}
//		return s1;
		return str.replaceAll("(?)[aeiou]", "");
    }

}
