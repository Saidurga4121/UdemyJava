package Programs;

//public class Interview 
//{
//	
//	public static void main(String[] args)
//	{
//		// break cannot be used outside of a loop or switch
////			if(true)
////			{
////				break;
////			}
//		
//	}
//
//}


// only the super class can be public ...rest of the public classes needs to define in its own file
public class Interview 
{
	public void displayResult() 
	{
		System.out.println("Printing from superclass");
	}
	
	
}
class subclass extends Interview 
{
	
	public void displayResult()
	{
		// this super can be any statement and can be used in side a method
		// but call to super can be used only in constructor.
		System.out.println("Displaying from subClass");
		super.displayResult();
	}
	public static void main(String args[]) 
	{
		subclass obj = new subclass();
		obj.displayResult();
	}
	
	
	
	
}




