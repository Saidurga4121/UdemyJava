package OOPSConcepts;

public class SuperKeyword 
{
	int a=10;
	SuperKeyword()
	{
		System.out.println("iam superclass constructor");
	}
	public void display()
	{
		System.out.println("iam in super class");
	}
	public static void main(String[] args)
	{
		Subclass obj= new Subclass();
		obj.display();
	}
}
class Subclass extends SuperKeyword
{
	// int a=20;
	Subclass()
	{
	//	super();
		System.out.println("iam subclass constructor");
	}
	public void display()
	{
		System.out.println("iam in subclass");
		a=30;
		System.out.println(super.a);   // 30
		super.display();
		// we can access parent class attributes by calling super keyword.
	}
}



class Person
{  
	int id;  
	String name;  
	Person(int id,String name)
	{  
		this.id=id;  
		this.name=name;  
	}  
}  
class Emp extends Person
{  
	float salary;  
	Emp(int id,String name,float salary)
	{  
		super(id,name);//reusing parent constructor 
		this.salary=salary;  
	}  
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}  
}  
class SuperKeyword1
{  
	public static void main(String[] args)
	{  
		Emp e1=new Emp(1,"ankit",45000f);  
		e1.display();  
    }
}  


// super keyword
// super keyword refers to immediate parent class object
// so when u create a instance for subclass ..this super keyword which is 
// responsible for calling parent constructor will be invoked implicity by compiler
// super can be used to refer immediate parent class instance variable/method/constructor.
// super() will be by defualt invoked by complier
// super() should be the first word in constructor.
