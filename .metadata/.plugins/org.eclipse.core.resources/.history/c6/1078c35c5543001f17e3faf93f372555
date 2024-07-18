package com.turing.dsa.adt.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DelimiterMatcher {
	char currentChar;
	String input;
	Stack<Character> stack;
	Map<Character, Character> pair;

	DelimiterMatcher(String input) {
		stack = new Stack<Character>();
		this.pair = new HashMap<Character, Character>();
		this.input = input;

		this.init();

	}

	void init() {
		this.pair.put('[', ']');
		this.pair.put('(', ')');
		this.pair.put('{', '}');
		this.pair.put('<', '>');
	}

	public Character getClosing(Character opening) {
		return this.pair.get(opening);
	}

	public boolean isValid() {
		for (int i = 0; i < input.length(); i++) {

			this.currentChar = input.charAt(i);

			if (this.isOpening(currentChar)) {

				System.out.println("Push into the stack = " + currentChar);

				this.stack.push(currentChar);
			}
			if (this.isClosing(currentChar)) {
				
				if(this.stack.isEmpty())
				{
					return false;
				}

				char openingChar = this.stack.pop();

				System.out.println("openingChar = " + openingChar);
				
				System.out.println("Current Char =" + currentChar);
				
				if(isProperlyMatch(openingChar, currentChar))
				{
					return false;
				}
			}

		}

		return this.stack.isEmpty();
	}

	public Boolean isProperlyMatch(Character openingChar, Character currentChar) {
		
		char closing = this.getClosing(openingChar);
		
		System.out.println("Closing = "+ closing );
		
		if(closing != currentChar)
		{
			return true;
		}
	
		return false;
	
	}

	public Boolean isOpening(Character ch) {
		return this.pair.keySet().contains(ch);
	}

	public Boolean isClosing(Character ch) {
		return this.pair.values().contains(ch);
    }

}
