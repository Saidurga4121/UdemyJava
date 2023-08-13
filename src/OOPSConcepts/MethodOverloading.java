package OOPSConcepts;

public class MethodOverloading 
{
	public static void main(String[] args)
	{
		MethodOverloading obj= new MethodOverloading();
		obj.test();
		// ambigiuty bcz of the cast issue
		// obj.test(10,20);
		obj.test(10, 20,30);
	}
	
	// it allows a class to have multiple methods with same name 
	// along as they differ in parameters/arguments, it is known as Method Overloading.
	public void test()
	{
		System.out.println("iam with no parameters");
	}
	
	public void test(long a ,int b)
	{
		System.out.println("iam with int parameters" + a + b);
	}
	public void test(int a ,long b)
	{
		System.out.println("iam with long parameters" + a + b);
	}

	
	// we cannot add the same method(same parameters) even if the return type is different.
	//	public int test(int a ,int b)
	//	{
	//		System.out.println("iam with int parameters");
	//		return a;
	//	}
	
	public void test(int a ,int b,int c)
	{
		System.out.println("iam with 3 int  parameters" + a+ b+ c);
	}
	
	
	
	/////////////////////////stack and heap/////////////////////////////////
	// stack --LIFO
	// local variables and normal methods,and reference variable(obj) (which is used for creating objects)are stored in stack
	// global variables and object creation are stored in heap
	// static variables and methods will be stored in metaspace

}
