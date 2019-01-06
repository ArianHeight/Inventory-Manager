/*
 * This is the File Reading Engine
 * Controls all mechanics used for file reading
 * - Lexing
 * - Parsing
 *
 * */

package Read;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader
{
    private Scanner reader = new Scanner(System.in); //temporary

	public Reader()
	{
		//cstr
	}

	public boolean setFileToRead(String filePath) //takes relative path and sets scanner input to it
    {
        try
        {
            reader.close(); //close the last input
            File f = new File(System.getProperty("user.dir") + filePath); //makes new file w/ absolute path
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

	public void Dstr()
    {
        //dstr
    }
}
