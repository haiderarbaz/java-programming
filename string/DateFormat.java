import java.lang.*;
import java.util.*;

public class DateFormat
{
	public static void main(String[] args)
	{
	 String d = "01/12/2000";
	
	 System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
	}
}