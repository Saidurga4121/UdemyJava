package Polymorphism;

public class StaticDynamicBinding 
{
	// When type of the object is determined at compiled time(by the compiler),--static binding.
	// If there is any private, final or static method in a class, there is static binding.
	
	//	class Dog
	//	{  
	//		 private void eat()
	//		 {
	//			 System.out.println("dog is eating...");
	//	     }  
	//		  
	//		 public static void main(String args[])
	//		 {  
	//			  Dog d1=new Dog();  
	//			  d1.eat();  
	//		 }  
	//	}
	
	//	class Animal
	//	{  
	//		 void eat()
	//		 {
	//			 System.out.println("animal is eating...");
	//		 }  
	//	}  
	//		  
	//	class Dog extends Animal
	//	{  
	//		 void eat()
	//		 {
	//			 System.out.println("dog is eating...");
	//		 }  
	//		  
	//		 public static void main(String args[])
	//		 {  
	//			  Animal a=new Dog();  
	//			  a.eat();  
	//		 }  
	//	}  
	
	// In the above example object type cannot be determined by the compiler, 
	// because the instance of Dog is also an instance of Animal.
	// So compiler doesn't know its type, only its base type.

	/////////////////////////////////////////////////////////////////////////////////
	
	// covariant return type says either the return type should be same as of the parent class or
	// it should be the child of it for an overrided method.
	
	//
	//	class A
	//	{    
	//	   A get()
	//	   {
	//		   return this;
	//	   }    
	//	}    
	//	    
	//	class B1 extends A
	//	{    
	//		@Override  
	//		B1 get()
	//		{
	//			return this;
	//		}    
	//		void message()
	//		{
	//			System.out.println("welcome to covariant return type");
	//		}    
	//		    
	//		public static void main(String args[])
	//		{    
	//		    new B1().get().message();    
	//		}    
	//	}   
	
	// downcasting
	
	// Parent p= (Child)p

}
