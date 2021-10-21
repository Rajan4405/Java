package stack;

import java.util.Stack;

public class StackDemo
{
	public static void main(String[] args)
	{

		Stack s = new Stack(); //legacy collection
		s.push("one");
		s.push("two");
		s.push("three");
		s.push("four");
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}

}
