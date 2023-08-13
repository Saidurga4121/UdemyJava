package OOPSConcepts;

class StaticKeyword 
{
	    // if the variable is not static ..then the output of this program is 1,1,1
		// if the variable is static ...then the output is 1,2,3 bcz the execution again wont come to 7 th line
	    // since the memory will get once.
		// static int count =0;
	    int count=0;
	    StaticKeyword()
		{
			count++;
			System.out.println(count);
		} 
		public static void main(String args[])
		{
			StaticKeyword c1=new StaticKeyword();
			// we cannot use this and super inside a static method bcz this belongs to current class variable and static belongs to class variable.
			// System.out.println(this.count);
			StaticKeyword c2=new StaticKeyword();
			StaticKeyword c3=new StaticKeyword();
		}
		public static void main1()
		{
			StaticKeyword c1=new StaticKeyword();
			// we cannot use this and super inside a static method bcz this belongs to current class variable and static belongs to class variable.
			// System.out.println(this.count);
			StaticKeyword c2=new StaticKeyword();
			StaticKeyword c3=new StaticKeyword();
		}
		
		public void test()
		{
			main1(); // can access static methods inside a non static method
			main(null);
		}
		// static keyword is used for memory management in java
		// static can be a variable /method/ block
		// static variable is used to refer the common properties of all objects(it is not for a specific oject)
		// static variable gets the memory once in the class area at the time of class loading.
		// static method
		// A static method belongs to the class rather than the object of a class.
		// A static method can be invoked without the need for creating an instance of a class
		// we cannot access non static members inside a static method
		// this and super cannot be used in static context.
		// static block
		// static block will get executed before main method
		// it is the first step in execution
		// main point
		// even if it is non static variable ...we can access it inside static block
        // we cannot declare static variables inside a static contexts bcz static variables are global variables.
}
//class Sample 
//{
//    int x = 10;
//	public static void main(String[] args)
//	    {
//	    	Sample t1 = new Sample();
//	        System.out.println(t1.x);
//	    }
//	    static
//	    {
//	        int x = 20;
//	        System.out.print(x + " ");
//	    }
//} 

// static variable is class level variable. 
// if we do update in any reference then automatically 
// all pointing reference value are changed

//class Test1 
//{
//    static int x = 10;
//    public static void main(String[] args)
//    {
//        Test1 t1 = new Test1();
//        Test1 t2 = new Test1();
//  
//        t1.x = 20;
//        System.out.print(t1.x + " ");
//        System.out.println(t2.x);
//    }
//}
//
//o/p: 20 20


  
 


