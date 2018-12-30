/*
 * This is The TextOutput Engine
 * Controls all console-based outputs that the program does
 * - encoding each data structure to string for output
 * - actually outputting strings
 * 
 */

package Text;
import java.lang.*;

public class TextOutput 
{
	public TextOutput() {} //empty cstr
	
	public String formatCurrency(int cents) //value of something in cents, returns value of something in dollars
	{
		String returnValue = String.valueOf(cents); //translates the cent value into a formattable string
		int cutIndex = returnValue.length() - 2; //name
		return "$" + returnValue.substring(0, cutIndex) + "." + returnValue.substring(cutIndex); //splices in a period at cut index
	}
	
}
