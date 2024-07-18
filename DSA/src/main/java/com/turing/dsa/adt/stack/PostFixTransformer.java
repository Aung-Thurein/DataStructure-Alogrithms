package com.turing.dsa.adt.stack;

import java.util.HashMap;
import java.util.Stack;

public class PostFixTransformer {
	static HashMap<Character, Integer> precedence = new HashMap<Character, Integer>();

	static {
		precedence.put('+', 1);
		precedence.put('-', 1);
		precedence.put('*', 2);
		precedence.put('/', 2);

	}

	public static String transform(String infix)

	{
		String postFix = "";

		Stack<Character> opStack = new Stack<Character>();

		for (int i = 0; i < infix.length(); i++) {
			char scannedChar = infix.charAt(i);

			if (isOperand(scannedChar)) {
				postFix += scannedChar;

			}

			else if (isOperator(scannedChar)) {
				if (opStack.isEmpty()) {
					opStack.push(scannedChar);
				}

				else // stack not empty
				{
					if (isGreaterThan(scannedChar, opStack.peek())) {
						opStack.push(scannedChar);
					} else if (isLessThan(scannedChar, opStack.peek()) || isEqual(scannedChar, opStack.peek())) {

						char ch = opStack.pop();

						if (ch != '(') {
							postFix += ch;

						} else {
							opStack.push('(');
							break;
						}

						opStack.push(scannedChar);

					} else if (opStack.contains('(')) {
						opStack.push(scannedChar);
					}

				}
			} else if (scannedChar == '(') {
				opStack.push(scannedChar);
			} else if (scannedChar == ')') {

				while (!opStack.isEmpty() && opStack.peek() != '(') {
					char op = opStack.pop();
					if (op != '(' || op != ')') {
						postFix += op;
					}
				}

				if (!opStack.isEmpty() && opStack.peek() == '(') {
					opStack.pop();
					while (!opStack.isEmpty()) {
						postFix += opStack.pop();
					}
				}
			}
		}

		while (!opStack.isEmpty()) {
			char cp = opStack.pop();

			if (cp != '(' || cp != ')') {
				postFix += cp;
			}
		}

		return postFix;
	}

	public static Boolean isOperator(char ch) {
		return ch == '*' || ch == '/' || ch == '+' || ch == '-';
	}

	public static Boolean isOperand(char ch) {
		return Character.isLetter(ch);
	}

	public static Boolean isGreaterThan(char op1, char op2) {
		try {
			return precedence.get(op1) > precedence.get(op2);
		} catch (Exception e) {
			return false;
		}
	}

	public static Boolean isLessThan(char op1, char op2) {
		try {
			return precedence.get(op1) < precedence.get(op2);
		} catch (Exception e) {
			return false;
		}
	}

	public static Boolean isEqual(char op1, char op2) {

		try {
			return precedence.get(op1).equals(precedence.get(op2));
		} catch (Exception e) {
			return false;
		}
	}
}
