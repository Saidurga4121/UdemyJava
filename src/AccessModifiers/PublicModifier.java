package AccessModifiers;

public class PublicModifier extends ProtectedModifier
{
	public static int a=10;
	public static void main(String[] args)
	{
		PublicModifier obj=new PublicModifier();
		ProtectedModifier obj1= new ProtectedModifier();
		System.out.println(obj.c);
	//	System.out.println(obj.b);
		// public can be accessed anywhere
		System.out.println(a);
	}	
}
