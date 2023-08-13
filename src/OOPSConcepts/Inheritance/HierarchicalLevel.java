package OOPSConcepts.Inheritance;

public class HierarchicalLevel {

	public static void main(String[] args) 
	{
		I i = new I(5);
		System.out.println("********");
		J j= new J(6,7);
		System.out.println("********");
		Z z= new Z(8,9);
	}
}
class I
{
	int i;
	I(int i)
	{
		this.i=i;
		System.out.println(i);
	}
}

class J extends I
{
	int j;
	J(int i,int j)
	{
		super(i);
		this.j=j;
		System.out.println(i + " " + j);
	}
}

class Z extends I
{
	int k;
	Z(int i,int k)
	{
		super(i);
		this.k=k;
		System.out.println(i + " " + k);
	}
}

// several classes inherit their features from the same class, 
// the type of inheritance is said to be hierarchical

