import java.lang.*;
import java.util.*;

public class MethVariableArg1
{
	static void showList(int start,String...s) 
	{
	 for (int i=0;i<s.length;i++)
	 {
		System.out.println(start+". "+s[i]); //i will print index and beside that it will show a string.
		start++;
	 }
	}
	public static void main(String[] args)
	{
		showList(5,"faizan","akram","tipu","azhan","abhijeet","harsh"); //ordering will start from 5 onwards
	}
}