package OOPSConcepts.Inheritance;

public class MultipleLevel 
{
	public static void main(String[] args)
	{
		
	}
}

class P
{
	int i;
	P()
	{
		System.out.println(" iam in p");
	}
	public void display()
	{
		System.out.println("iam displaying in p");
	}
	
}
class N 
{
	int k;
	N()
	{
		System.out.println("iam in n");
	}
	public void display()
	{
		System.out.println("iam displaying in n");
	}
}

class M extends P,N
{
	M()
	{
		super();	
		System.out.println("iam in m");
	}
	M m = new M();
	m.display();
}

// one subclass inheriting multiple immediate super classes is called multiple inheritance.
// multiple inheritance in java is not supported in bcz of 2 ways
// 1) diamond problem
// we have class A and B as super classes and C as subclass
// and in a and b we have a constructor , then even though we didnt add 
// call to super() , by default compiler will add it .. so complier will get 
// confused to which super class the call should go
// 2) second problem
// if a and b have same method like display ...when we create an object and 
// and call that display method ...compiler doesnt know which superclass's display need to be called.
