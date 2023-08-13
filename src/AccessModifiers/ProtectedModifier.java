package AccessModifiers;

public class ProtectedModifier 
{
	protected int c=30;
	//
	protected void display()
	{
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		D d= new D();
		d.display();
	}
}

class D extends ProtectedModifier
{
	void display()
	{
		System.out.println(c);
	}
}
