import java.lang.*;
import java.util.*;

public class MethVariableArg
{
	static void show(int...X) //this will works for all
	//static void show(int X[]) //this will only work for not for all elements or we to change others into array
	{
	 for (int y:X)
	 {
		System.out.println(y);
	 }
	}
	public static void main(String[] args)
	{
		show();
		show(80,90,100);
		show(10,20,30,40);
		show(new int[]{3,5,2,7,88,99,100,999});
	}
}