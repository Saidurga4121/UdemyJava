package CodeWars;

public class BraceChecker {

	public static void main(String[] args)
	{
		String s="(){}[";
		boolean flag=isValid(s);
		System.out.println(flag);
		
	}
	public static boolean isValid(String braces) { 
	    String b = braces;  
	    
	      b = b.replaceAll("[()]", "");
	      b = b.replaceAll("[\\[]]", "");
	      b = b.replaceAll("[{}]", "");
	      if(b.length() == 0)
	        return true;
	    
	    return false;
	  }

}
