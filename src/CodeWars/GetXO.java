package CodeWars;

public class GetXO {

	public static void main(String[] args)
	{
		String s="zzooxxp";
		boolean flag=getXO1(s);
		System.out.println(flag);
	}
	
	public static boolean getXO1 (String str) 
	{
	    String xValues = str.replaceAll("[^xX]", "");
	    System.out.println(xValues);
	    String oValues = str.replaceAll("[^oO]", "");
	    System.out.println(oValues);  
	    return xValues.length() == oValues.length();
	  }
	 public static boolean getXO (String str)
	 {
		 int oCount=0;
		 int xCount=0;
		 for(int i=0;i<str.length();i++)
		 {
			 char ch=str.charAt(i);
			 if(ch=='o' || ch=='O')
			 {
				 oCount++;
			 }
			 else if(ch=='x' || ch=='X')
			 {
				 xCount++;
			 }
		 }
		 return oCount==xCount;
		   
	 }
	 
	 
	 

}
