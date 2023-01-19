import java.util.Scanner;

/* Author: Eric Thomas
 * Professor: Ian O'Toole
 * Course: SOFTWARE INTEGRATION, CONFIGURATION, AND TESTING: CEN4802C
 * Date: 1/22/2023
 * Description: Implement a Java class that contains two methods:
 * 1. A recursive static method that returns the nth term in the Fibonacci sequence. The method should accept n as a parameter. 
 * Do not include javadoc code in your implementation (yet).
 * 2. A main method that calls the first method. Pass in 10 as an argument. Output the 10th term of the Fibonacci sequence 
 * along with some descriptive text, e.g. "The nth term of the Fibonacci sequence is y." Don't hard-code the results; output the appropriate variables.
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aNumber = 0;

		System.out.print("Enter a number to start with: ");
		aNumber = scanner.nextInt();
		
		System.out.println("The nth term of the Fibonacci sequence is: " + FibonacciSequence(aNumber));
		
		scanner.close();
	}
	
	private static int FibonacciSequence(int aNumber) {

		if (aNumber == 0 || aNumber == 1)
			return 0;
		else if(aNumber == 2)
			return 1;
		return FibonacciSequence(aNumber - 1) + FibonacciSequence(aNumber - 2);

	}

}
