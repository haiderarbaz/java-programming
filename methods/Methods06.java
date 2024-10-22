import java.lang.*;
import java.util.*;

//difference between passing a primitive and passing an object to a method

//1. Passing a Primitive Type:
//Primitive types in Java include int, double, char, boolean, etc.
//When you pass a primitive type to a method, Java passes the value by copy.
//This means that the method gets a copy of the primitive value, and any changes made to this value inside the method do not affect the original value outside the method.

//2. Passing an Object Reference:
//In Java, all objects are passed by reference.
//When you pass an object to a method, Java passes a copy of the reference to the object. The reference points to the same memory location as the original object.
//This means that modifications to the object's fields within the method affect the original object because both the original and the copied reference point to the same object in memory.
//

public class Methods06
{	
	public static void modifyPrimitive(int num) 
	{
        num = 10; // Modifies the copy of 'x'
    }
	
	public static void modifyObject(int X[], int index, int value) 
	{
        X[index]=value; // Modifies the original object
    }
	public static void main(String[] args)
	{
		int x = 5;
        modifyPrimitive(x);
        System.out.println(x); // Output: 5
	
		int A[]={3,6,9,12,15};
		modifyObject(A,3,10);
		
		for (int y:A)
		{
			System.out.println(y);
		}
		
	}
}