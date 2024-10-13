import java.lang.*;
import java.util.*;

public class HexaDecimalOrNot
{
	public static void main(String[] args)
	{
	 String str = "234AB";
	 
	 //String str = "B234AZ";
	 //OP will be false because z is not a hexadecimal
	 
	 //System.out.println(str.matches("[0-9A-F]*"));
	 System.out.println(str.matches("[0-9A-F]+"));
	}
}