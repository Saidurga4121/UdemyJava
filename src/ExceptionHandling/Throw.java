package ExceptionHandling;

public class Throw 
{
	static int av;
	static void check(int a)
	{
		
		if(a<18)
		{
			// throwing an exception explicity inside a method/function
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {		
		check(12);
		System.out.println("hello");
	}

}

// Throw keyword is used to throw an exception explicity in the code , inside a method or function
// used for run time exceptions
// throw only single exception
// throw keyword is followed by the instance variable
// used within the method.
