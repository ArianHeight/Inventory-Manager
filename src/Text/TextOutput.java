/*
 * This is The TextOutput Engine
 * Controls all console-based outputs that the program does
 * - encoding each data structure to string for output
 * - actually outputting strings
 * 
 */

package Text;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class TextOutput 
{
	public TextOutput() {} //empty cstr
	
	public String formatCurrency(int cents) //value of something in cents, returns value of something in dollars
	{
		String returnValue = String.valueOf(cents); //translates the cent value into a formattable string
		int cutIndex = returnValue.length() - 2; //name
		return "$" + returnValue.substring(0, cutIndex) + "." + returnValue.substring(cutIndex); //splices in a period at cut index
	}

	//outputs every instance in the arraylist
	public <T> void formatArray(ArrayList<T> in)
	{
		String output = "";
		for (T instance : in)
		{
			output += instance + ", ";
		}
		System.out.println(output.substring(0, output.length() - 2));
	}

	//outputs every instance in the arraylist
	public <T> void formatArray(List<T> in)
	{
		String output = "";
		for (T instance : in)
		{
			output += instance + ", ";
		}
		System.out.println(output.substring(0, output.length() - 2));
	}

	public void Dstr()
	{
		//dstr
	}
}
