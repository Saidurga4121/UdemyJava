package ExceptionHandling;

public class ExecptionHandling {

	public static void main(String[] args) 
	{
		method1();
		System.out.println("iam in main method");
	}
	
	// method1 is calling method
	public static void method1()
	{
		method2();
		System.out.println("iam in method1");
	}
	
	// method2 is called method
	public static void method2()
	{
		try
		{
			String name=null;
			name.length();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			// e.printStackTrace();
			System.out.println("iam in method1");
			// if we dont want to execute finally block ...we can put this and crash the jvm
			// System.exit(0);
		}
		finally
		{
			System.out.println("iam executed");
		}
	}
}

// we will surrond the exception by using try/catch block
// catch is used to tell the type of exception caused
// e.printStackTrace() is used to print the error logs
// a try can have multiple catch blocks ...but out of all catch blocks ...it will take the appropriate catch block
// a try can be with catch and finally
// a try can be only with catch
// a try can be only with finally
