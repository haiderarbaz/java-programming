import java.lang.*;
import java.util.*;

public class SumOnCommandLine
{
	public static void main(String[] args)
		{	
			//Variable to store the sum of numbers, initialized to 0
			double s=0;
			//For-each loop to iterate over all the command line arguments 
			for(String x:args)
			{	
				//Checking if the argument is a valid number (using regex to match numbers and decimals) if it's not a valid number then it will ignore
				if(x.matches("[0-9\\.]+"))
				//Parsing the string argument as a double and adding it to the sum
				s=s+Double.parseDouble(x);
			}
			System.out.println("Sum is "+s);
		}
}