package Polymorphism;

public class Polymorphism 
{
	public static void main(String args[])
	{  
	    Bike b = new Splendor();//upcasting  
	    b.run(); 
	    // can access only parent class variables
	    // can access only overrided methods from subclass.(common of both)
	    // overiding is only for methods but not for variables in dynamic polymorphism
	    // so runtime polymorphism can't be achieved by data members.
	    System.out.println(b.a);
	}
}
class Bike
{  
	  int a=20;
	  void run()
	  {
		  System.out.println("running");
	  }
	  
	  
}  
class Splendor extends Bike
{  
	  int a=200;
	  void run()
	  {
		  System.out.println("running safely with 60km");
	  }  
	  void move()
	  {
		  System.out.println("moving");
	  }
}

// it allows to do the same action in multiple ways
// it allows the object to take multiple forms
// if it is having is-a relation , then the object is polymorphic 
// in java ..all the objects will have inheritance ..so all the objects are polymorphic
// types of polymorphism
// 1) static polymorphism
// 2)dynamic polymorphism
// static polymorphism/ complie time polymorphism is implemented through method overlaoding
// dynamic polymorphism is implemented through method overriding
// in run time polymorphism... the call to an overrided method is resolved at run time
// method invoking is determined by the JVM not compiler, it is known as runtime polymorphism
// here upcasting is involved--reference variable of a parent class refers to the object of the child class.
// why upcasting
// using the ref variable b(line 7) ..we can access all the parent class methods and variables but we can only access the overrided methods in subclass

