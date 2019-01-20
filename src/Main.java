import java.lang.*;
import java.util.*;
import Read.*;


public class Main //runner class
{

	public static void main(String[] args) 
	{
		Reader r = new Reader();

		ArrayList<String> a = new ArrayList<String>(0);

		r.readTokenUntil("|", a);

		r.setFileToRead("Data\\test.dat");

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

}


