/*
 * This is a Search Engine
 * Controls code used for searching through data points in a .dat file and
 * finding the correct index for file reading
 *
 */

package Search;
import java.util.Arrays;
import java.util.ArrayList;


import java.lang.*;
import java.util.Scanner;

public class Searcher {

	public Searcher() {
		// TODO constructor
	}

	public int getID() //temp getter
	{
		int item;
		return 0;
	}

	// Binary searches an ArrayList to find the dataset at an index
	public String binSearch(int index, ArrayList<String> data)
	{
		// dataset
			int low = 0;
			int high = data.size() - 1;
			int mid;

			while (low <= high){

				mid = (low + high) / 2;
				if (mid > index){
					high = mid - 1;
				}
				else if (mid < index){
					low = mid + 1;
				}
			else {
                return data.get(mid);
            }
		}

		return "Out of Bounds.";
	}
}
