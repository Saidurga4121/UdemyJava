package ExceptionHandling;

public class Throws {

	int div(int a,int b) throws ArithmeticException
	{
		int d=a/b;
		return d;
		
	}	
	public static void main(String[] args)
	{
		Throws obj= new Throws();
		try
		{
		   obj.div(10, 0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}

// Throws keyword is used in the method signature to declare an exception whoch might be thrown by a method during the excecution of code
// used for mainly complie time exceptions.
// can throw multiple exceptions
// thows keyword is follwed by exception class names
// used with the method signature.

