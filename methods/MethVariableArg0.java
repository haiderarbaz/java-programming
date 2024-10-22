import java.lang.*;
import java.util.*;

public class MethVariableArg0
{
	static void showList(String...s) 
	{
	 for (int i=0;i<s.length;i++)
	 {
		System.out.println(i+1+". "+s[i]); //i will print index and beside that it will show a string.
	 }
	}
	public static void main(String[] args)
	{
		showList("faizan","akram","tipu","azhan","abhijeet","harsh");
	}
}