package AccessModifiers;

public class PrivateModifier 
{
	private int b=20;
	 
	// if we have private constructor, then we cannot create obj for that class
	private PrivateModifier()
	{
		System.out.println("iam constructor");
	}
	private void run()
	{
		
	}

	public  void main(String[] args) 
	{
		System.out.println(b);
	}
}

class B extends PrivateModifier
{
    
	public void display()
	{
		// scope of private variable is within the class
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		PrivateModifier obj= new PrivateModifier()
		{
			
		}
	}
}
