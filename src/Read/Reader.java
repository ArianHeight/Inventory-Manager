/*
 * This is the File Reading Engine
 * Controls all mechanics used for file reading
 * - Lexing
 * - Parsing
 *
 * */

package Read;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Reader
{
    private Scanner reader = new Scanner(System.in); //temporary
    private String eofMSG = "Lexer has reached end of file...";

	public Reader()
	{
		//cstr
	}

	public boolean setFileToRead(String filePath) //takes relative path and sets scanner input to it
    {
        try
        {
            reader.close(); //close the last input
            File f = new File(System.getProperty("user.dir") + "\\" + filePath); //makes new file w/ absolute path
            reader = new Scanner(f); //makes scanner
        }
        catch (FileNotFoundException e)
        {
            //TODO catch expection here
            System.out.println("FAILED");
            return false; //unsuccessful return false
        }

        return true; //input change was successful, return true
    }

    //reads a certain number of tokens and outputs them into the output list
    public boolean readToken(int numOfTokens, ArrayList<String> output)
    {
        String inputHolder = ""; //temporary place to hold input

        try
        {
            do
             {
                 if (!reader.hasNext()) //no more data, throw eof
                 {
                     throw new EOFException(eofMSG);
                 }

                 //takes input and adds it to output
                 inputHolder = reader.next();
                 output.add(inputHolder);
                 numOfTokens--; //counts down
            }
            while (numOfTokens > 0);
        }
        catch (EOFException e) //error handling
        {
            System.out.println(e);
            return false;
        }

        return true; //reach end without trouble
    }

    //reads all tokens until a closing operand or eof is reached, and outputs them to a list
    public void readTokenUntil(String closingOperand, ArrayList<String> output)
    {
        String inputHolder = "";  //temporary place to hold data

        try
        {
            while (true) //repeat until stopped
            {
                if (!reader.hasNext()) //check for eof
                {
                    throw new EOFException(eofMSG);
                }

                inputHolder = reader.next(); //reads input

                if (inputHolder.equals(closingOperand)) //check for stopping delimiter
                {
                    break; //hit the closing operand, can stop reading
                }

                output.add(inputHolder); //outputs
            }
        }
        catch (EOFException e) //error handling
        {
            System.out.println(e);
        }
    }

	public void Dstr()
    {
        //dstr
    }
}
