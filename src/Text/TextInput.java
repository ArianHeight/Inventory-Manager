/*
 * This is the text input engine
 * controls all mechanics used for user input from the console
 * 
 */

package Text;
import java.lang.*;
import java.util.Scanner;

public class TextInput {
	private static Scanner scanner = new Scanner(System.in); //init
	
	public TextInput() {} //empty cstr
	
	private void consoleErr() //console error msg and treatment
	{
		System.out.println("Incorrect Input Type, Please Try Again"); //error msg
		scanner.nextLine(); //voids the input stream
	}
	
	public int getInt() //safe input for integer
	{
		//base values
		int returnValue = 0;
		boolean hasValue = false;
		
		do
		{
			try
			{
				returnValue = scanner.nextInt(); //grabs value
				hasValue = true; //only runs if no exception
			}
			catch (java.util.InputMismatchException err) //input mismatch exception
			{
				consoleErr(); //catch block w/ prompt
			}
		}
		while (!hasValue); //re-does user input if incorrect type was entered
		
		return returnValue;
	}
	
	public double getDouble() //safe input for doubles
	{
		//base values
		double returnValue = 0.0;
		boolean hasValue = false;
		
		do
		{
			try
			{
				returnValue = scanner.nextDouble(); //grabs value
				hasValue = true; //only runs if no exception
			}
			catch (java.util.InputMismatchException err) //input mismatch exception
			{
				consoleErr(); //catch block w/ prompt
			}
		}
		while (!hasValue); //re-does user input if incorrect type was entered
		
		return returnValue;
	}
	
	public String getString() //wrapper for consistency
	{
		return scanner.nextLine();
	}
	
	//maybe a get currency in ze future?
}
