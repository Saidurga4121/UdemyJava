package AccessModifiers2;

import AccessModifiers.ProtectedModifier;
import AccessModifiers.PublicModifier;

public class Publics {

	public static void main(String[] args) 
	{
		PublicModifier obj = new PublicModifier();
		ProtectedModifier obj1= new ProtectedModifier();
		System.out.println(obj1.c);
		System.out.println(obj.a);
	}

}
