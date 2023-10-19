/**
 * A driver that demonstrates the class Infix.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 4.1
 */
public class Driver {
	public static void main(String[] args) {
		System.out.println("Testing infix expressions with\n" +
				"a = 2, b = 3, c = 4, d = 5\n\n");

		testInfix("a+b");
		testInfix("(a + b) * c");
		testInfix("a * b / (c - d)");
		testInfix("a / b + (c - d)");
		testInfix("a / b + c - d");
		testInfix("a^b^c");
		testInfix("(a^b)^c");
		testInfix("a*(b/c+d)");
		System.out.println("\n\nDone.");
	} // end main

	public static void testInfix(String infixExpression) {
		System.out.println("Infix: " + infixExpression);
		System.out.println("Value: " + Infix.evaluateInfix(infixExpression));
		System.out.println("\n");
	} // end testInfix
} // end Driver

/*
 * Testing infix expressions with
 * a = 2, b = 3, c = 4, d = 5
 * 
 * 
 * Infix: a+b
 * Value: 5.0
 * 
 * 
 * Infix: (a + b) * c
 * Value: 20.0
 * 
 * 
 * Infix: a * b / (c - d)
 * Value: -6.0
 * 
 * 
 * Infix: a / b + (c - d)
 * Value: -0.33333333333333337
 * 
 * 
 * Infix: a / b + c - d
 * Value: -0.33333333333333304
 * 
 * 
 * Infix: a^b^c
 * Value: 2.4178516392292583E24
 * 
 * 
 * Infix: (a^b)^c
 * Value: 4096.0
 * 
 * 
 * Infix: a*(b/c+d)
 * Value: 11.5
 * 
 * 
 * 
 * 
 * Done.
 */