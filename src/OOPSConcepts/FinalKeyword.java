package OOPSConcepts;

public class FinalKeyword 
{
	// cannot change the final variable. it is constant. it should be initialized
    final int age1=20;
	
	// it can be blank value and can be initialized 
    // only in a constructor and in static block but not in method.
	final int age;
	
	FinalKeyword()
	{
		age=20;
	}
	
	static final int age2;
	
	static 
	{
		age2=20;
	}
	
    public void display()
    {
    	age1=20;
    }   
    public static void main()
    {
    	//FinalKeyword obj= new FinalKeyword();
    	//obj.display();
    	Car obj1= new Car();
    	//
    	// final method can be inherited but cannot be overridden.
    	obj1.move();
    }
}

//final class Bike
// class Bike
{    
	// cannot override the final method
    final void move()
    {
    	System.out.println("iam displaying");
    }
    final void move(int a)
    {
    	System.out.println("iam displaying");
    }
    
}
// cannot extend a final class . final cannot be inherited.
class Car extends Bike
{
	void move()
	{
		System.out.println("iam not displaying");
	}
	
}

// Final keyword is used to restrict the user 
// final can be a variable ,method and class
// final variable
// If you make any variable as final, 
// you cannot change the value of final variable(It will be constant).
/////////////////////////////////////
// final cannot be inherited ,overridden
