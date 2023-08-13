package Collections;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) 
	{
		Stack<String> books= new Stack<>();
		//
		books.push("red");
		books.push("black");
		books.push("white");
		
		System.out.println(books +" original stack");
		books.pop();   // white will be removed bcz of lifo
		System.out.println(books);
		
		System.out.println(books.peek());  // we will see the lastly added element present in stack
		System.out.println(books);
		
		System.out.println(books.search("black")); // 1 ...bcz it is the last element (count starts from 1)
		System.out.println(books.search("red"));   // 2
		System.out.println(books.indexOf("red"));  // 0 ...bcz indexing starts from 0. 
		

	}
	
	
	// stack is a class which implments list interface and extends vector class and implements LIFO principle
	// we have to assume stack in vertical order.
	// we have four methods in stack -PUSH ,POP, PEEK, SEARCH
	// push --for adding the elements we will use push
	// pop- for removing
	// peek- for seeing the result 
	// search -to search the index of the element ..works same as indexof but it will give the index in reverse way

}
