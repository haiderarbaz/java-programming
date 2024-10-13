import java.lang.*;
import java.util.*;

public class RemoveSpecialCharacters
{
	public static void main(String[] args)
	{
	 String str = "a!B@c#1$2%3";
	
	 System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
	 //^(symbol not)it means if it is not among these mention characters change into desired characters or empty space.
	}
}