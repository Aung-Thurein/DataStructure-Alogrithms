package com.turing.dsa.adt.stack;
import java.util.Stack;

public class ReversedWord {
	
	public static void main(String[] args) {
		String data = "hello";
		Stack <Character> stack = new Stack<Character>();
		for (int i = 0; i < data.length(); i++) {
			stack.push(data.charAt(i));
		}
		String reversed = "";
		while(!stack.isEmpty())
		{
			reversed += stack.pop();
		}
		System.out.println("Reversed = "+ reversed);
			
		}
}
