package OOPSConcepts.Inheritance;

class inheritance 
{
    int i;
    inheritance()
    {
    	// this.i=i;
    	System.out.println(i);
    }
}

class B extends inheritance
{
	int j;
	B(int i,int j)
	{
		// constructor chaining
		// super();
		this.i=i;
		this.j=j;
	}
}

public class SingleLevel
{
	public static void main(String[] args)
	{
		inheritance obj= new inheritance();
		B obj1= new B(7,8);
		System.out.print(obj1.i+ " ");
		System.out.println(obj1.j);
	}
}


// Acquiring properties from one class to another class is called inheritance
// it is acheived by the keyword called extends
// using super class ..we can access only super class members but by
// using sub class object we can access both class members

//////////////////////////////////////////////////////////////////////
// static members cannot be inherited.
// static memebers cannot be overridden.

