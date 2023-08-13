package OOPSConcepts;

public class ThisKeyword 
{
	int rolNo;
	int age;
	float salary;
	ThisKeyword()
	{
		System.out.println("iam default");
	}
	public ThisKeyword(int i, int j)
	{
		this();
		// this is a ref variable in java that is used to refer current class object variable.
		// this is used to initialize non static variables inside a constructor.
		this.rolNo=i;
		this.age=j;
	}
	
	public ThisKeyword(int rolno, int age, float sal)
	{
		// call to this will invoke the current class constructor.
		// should be the first statement in a constructor.
		this(rolno,age);
		this.salary=sal;
	}

	public void display()
	{
		System.out.println(rolNo);
		System.out.println(age);
		System.out.println(salary);
	}
	
	static public void main(String[] args)
	{
		ThisKeyword obj= new ThisKeyword(111,10,10);
		obj.display();
	}

	// constructor can be public ,private and protected.
}
