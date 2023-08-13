package Abstraction;

interface Interfaces
{  
	void a();  
	void b();  
	void c();  
	void d(); 
	
	// when we want to log some thing which will never change...then we can use static method(dummy)
	// bcz of security also we can use ...
	public static void test()
	{
		System.out.println("iam static method");
	}
	
	// default method can be overrided
	default void defaultMethod()
	{
		System.out.println("iam default method");
	}
}  
  
abstract class B implements Interfaces
{  
	public abstract void ccc();	
	public void display()
	{
		System.out.println("iam non abstract method");
	}
	
	public void defaultMethod()
	{
		System.out.println("iam overrided");
	}
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}
}  
  
class M extends B
{

	@Override
	public void a() {
		System.out.println("a");
	}

	@Override
	public void b() {
		System.out.println("b");
		
	}

	@Override
	public void c() {
		System.out.println("c");
		
	}

	@Override
	public void d() {
		System.out.println("d");
		
	}

	@Override
	public void ccc() {
		System.out.println("ccc");
	}  

}  
  
  
class Test5
{  
	public static void main(String args[])
	{  
		Interfaces a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
		Interfaces.test();
    }
}  
