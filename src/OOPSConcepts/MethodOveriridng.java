package OOPSConcepts;

public class MethodOveriridng 
{
	public static void main(String[] args)
	{
		A obj= new B();
		obj.run();
		D obj1= new D();
		obj1.move();  // displays c method only bcz of static
	}

}
class  A
{
	public void run()
	{
		System.out.println("iam A running");
	}
}
class B extends A
{
	public void run()
	{
		System.out.println("iam B running");
	}
	
}

class  C
{
	public void move()
	{
		System.out.println("iam C running");
	}
}
class D extends C
{
	public static void move()
	{
		System.out.println("iam D running");
	}
	
	public void test()
	{
		
	}
	
}



// if a subclass has same method as of its parent class and have specific implementation
// which differs from its parent class ..then we can call it as method overriding.
// The method must have the same name as in the parent class
// The method must have the same parameter as in the parent class.
// There must be an IS-A relationship (inheritance).
