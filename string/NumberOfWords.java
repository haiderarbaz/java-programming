import java.lang.*;
import java.util.*;

public class NumberOfWords
{
	public static void main(String[] args)
	{
	 String str = "     abc    de    fgh   ijk   ";
	 str=str.replaceAll("\\s+"," ").trim();
	 String words[]=str.split("\\s+");
	
	 System.out.println(words.length);
	}
}