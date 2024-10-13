import java.lang.*;
import java.util.*;

public class RemoveSpaceFromString
{
	public static void main(String[] args)
	{
	 String str = "abc    de    fgh";
	 
	 String str1 = "     abc    de    fgh   ijk   ";
	
	 System.out.println(str.replaceAll("\\s+"," "));
	 System.out.println(str1.replaceAll("\\s+"," ").trim());
	}
}