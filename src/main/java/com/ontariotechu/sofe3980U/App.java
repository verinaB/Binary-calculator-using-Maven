/*package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 *
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());
    }
}**/
package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		// Get input for the first binary number
		System.out.print("Enter the first binary number: ");
		String binaryStr1 = scanner.nextLine();
		Binary binary1 = new Binary(binaryStr1);
		System.out.println("First binary number is " + binary1.getValue());

		// Get input for the second binary number
		System.out.print("Enter the second binary number: ");
		String binaryStr2 = scanner.nextLine();
		Binary binary2 = new Binary(binaryStr2);
		System.out.println("Second binary number is " + binary2.getValue());

		// Perform OR operation
		Binary resultOr = Binary.or(binary1, binary2);
		System.out.println("OR Result: " + resultOr.getValue());

		// Perform AND operation
		Binary resultAnd = Binary.and(binary1, binary2);
		System.out.println("AND Result: " + resultAnd.getValue());

		// Perform Multiply operation
		Binary resultMultiply = Binary.multiply(binary1, binary2);
		System.out.println("Multiply Result: " + resultMultiply.getValue());
	}
}

