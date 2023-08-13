package OOPSConcepts.Inheritance;

public class MultiLevel 
{
	public static void main(String[] args)
	{
		A a= new A(5);
		System.out.println("**************");
		K b= new K(6,7);
		System.out.println("**************");
		C c= new C(8,9,1);
		System.out.println("**************");
	}
}

class A
{
	int i;
	A(int i)
	{
		this.i=i;
		System.out.println(i);
	}
}

class K extends A
{
	int j;
	K(int i,int j)
	{
		super(i);
		this.j=j;
		System.out.println(i + " " + j);
	}
}

class C extends K
{
	int k;
	C(int i,int j,int k)
	{
		super(i,j);
		this.k=k;
		System.out.println(i + " " + j + " " + k);
	}
}

// One class inherits the features from a parent class 
// and the newly created sub-class becomes the base class
// for another new class.

