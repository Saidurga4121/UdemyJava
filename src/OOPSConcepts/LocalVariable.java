package OOPSConcepts;

public class LocalVariable
{
	// non static global value needs not to be intialized
	static int num1;
	int num;
	public static void main(String[] args)
	{
		int num3 = 0;
		 System.out.println(num1);
		 LocalVariable obj= new LocalVariable();
		 obj.main2();
		 System.out.println(num3);

	}
	public void main2()
	{
		System.out.println(num);
	}

}
