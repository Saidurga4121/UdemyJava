package Abstraction;

public  abstract class AbstractClass 
{
	// abstract method should not have body
	// abstract methods are non static in nature bcz we cannot override static methods
	// static abstract void run(); // error
		
	 public abstract void run();    // public or protected in nature
	 public abstract void run(int a);
	
	void nonAbstractMethod()
	{
		System.out.println("iam non abstract method");
	}
	
	// can have static ,non static ,final and non final variables
	static int a=10;
	final int b=20;
	int c=30;
	
	
	public static void main(String[] args)
	{
		// cannot create object for abstract class
		// AbstractClass ab=new AbstractClass();
		AbstractClass ab=new Honda();
		System.out.println(AbstractClass.a);
		System.out.println(ab.b);
		System.out.println(ab.c);
		ab.run();
	}	
}

// we should implement all the abstract methods in the sub class or else u can make the sub class as abstract
// abstract class Honda extends AbstractClass
class Honda extends AbstractClass
{
	@Override
	public void run(int a)
	{
				
	}

	@Override
	public void run()
	{
			
	}

	
}


// Hiding the implementation and showing the  functionality to the user is called
// abstraction is achieved by abstract methods
// abstract methods doesnt have method implementaion ..they only have method signature.
// if a class is using abstract method, then the class must be declared as abstract class.
// abstract class can have both abstract and non abstract methods
// we can't create an object of an abstract class
// it can have constructor,static variables and final variables
// cannot have static and final methods
//
//
// interface is used to achieve 100 percent abstraction and multiple inheritance
// by default , all the methods within the interface are abstract,public
// by default , all the variables are public ,static and final.
// by default ..since all are abstract ...we have override all the methods present in the interface


// if a normal class extends a abstract class ..then it has to implement all the abstract methods in the parent abstract class
// or without implementing we can make the sub class as abstract
//
// if a normal class or abstract class implements an interface ..then it has to implement all the abstract methods
// or without implementing we can make that subclass as abstract.

// but it 