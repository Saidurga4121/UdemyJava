package OOPSConcepts;

public class Constructor 
{
	    int id;  
	    String name; 
	    // we cannot override a constructor. we can overload a constructor.
	    Constructor(int i,String n)
	    {  
		    id = i;  
		    name = n;  
	    }  
	    Constructor()
	    {
	    	System.out.println("iam default");
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    }  
	   
	    public static void main(String args[])
	    {  
		    Constructor s1 = new Constructor(111,"Karan");  
		    Constructor s2 = new Constructor();  
		    s2.id=s1.id;  
		    s2.name=s1.name;  
		    s1.display();  
		    s2.display(); 
	    	System.out.println("iam done");
	   } 
	// a constructor is a type of method whose name is same as class .
	// two types of constructor ---defualt and parameterized
	// default constructor is implicity invoked by complier
	// parameterized constructor should be invoked by programmer
	// doesnt have any returm type
	// constructor cannot be static ,final,abstract

}  

