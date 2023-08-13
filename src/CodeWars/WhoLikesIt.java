package CodeWars;

public class WhoLikesIt {

	public static void main(String[] args) 
	{
		String[] s={"Jacob", "Alex","sai","durga","dur"};
		System.out.println(whoLikesIt(s));
	    
	}
	public static String whoLikesIt(String... s)
	{
        for(int i=0;i<s.length;i++)
        {
        	if(s.length==1)
        	{
        		return s[i]+" likes this";
        	}
        	else if(s.length==2)
        	{
        		// "Jacob and Alex like this"
        		return s[i]+" and "+s[i+1]+" like this";
        	}
        	else if(s.length==3)
        	{
        		return s[i]+","+s[i+1]+" and "+s[i+2]+" like this";
        	}
        	else if(s.length>4)
        	{
      
        		return s[i]+" ,"+s[i+1]+ " and 2 others like this";
        	}
        }
        return "no one likes this";
    }

}
