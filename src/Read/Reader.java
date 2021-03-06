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
    private boolean attachedToFile = false; //whether it is attached to a readable file or not
    private Scanner reader = new Scanner(System.in); //temporary
    private String eofMSG = ""; //end of file error msg
    private String datDelimiter = ""; //standard delimiter for our .dat files

	public Reader()
	{
		//cstr
        eofMSG = "Lexer has reached end of file..."; //end of file error msg
        datDelimiter = "/|[\\r\\n]"; //standard delimiter for our .dat files
    }

    //takes relative path and sets scanner input to it **required to be run before any other methods in this class!
	public boolean setFileToRead(String filePath)
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
            attachedToFile = false;
            return false; //unsuccessful return false
        }

        attachedToFile = true;
        return true; //input change was successful, return true
    }

    //reads a certain number of tokens and outputs them into the output list
    public boolean readToken(String delimiter, int numOfTokens, ArrayList<String> output)
    {
        if (!attachedToFile) //guard
        {
            return false; //early return if no file attached
        }

        reader.useDelimiter(delimiter);
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
            reader.reset(); //resets reader for next reading
            attachedToFile = false; //no longer attached to file
            return false;
        }

        reader.reset(); //resets reader for next reading
        return true; //reach end without trouble
    }

    public boolean readToken(int numOfTokens, ArrayList<String> output) //wrapper method
    {
        return readToken(datDelimiter, numOfTokens, output);
    }

    //reads all tokens until a closing operand or eof is reached, and outputs them to a list
    public void readTokenUntil(String delimiter, String closingOperand, ArrayList<String> output)
    {
        if (!attachedToFile) //guard
        {
            return; //early return if no file attached
        }

        reader.useDelimiter(delimiter); //sets delimiter for reading
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
            reader.reset(); //resets the delimiter
            attachedToFile = false;
        }

        reader.reset(); //resets the delimiter
    }

    public void readTokenUntil(String closingOperand, ArrayList<String> output) //wrapper method
    {
        readTokenUntil(datDelimiter, closingOperand, output);
    }

    public String getDatDelimiter()
    {
        return datDelimiter;
    }

	public void Dstr()
    {
        //dstr
    }
}
