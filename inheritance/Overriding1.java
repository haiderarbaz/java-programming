import java.lang.*;
import java.util.*;

class TV
{
	public void switchON()
	{
		System.out.println("TV is Switched ON");
	}
	public void changeChannel()
	{
		System.out.println("TV Channel is Changed");
	}
}
class SmartTV extends TV
{
	@Override
	public void switchON()
	{
		System.out.println("Smart TV is Switched ON");
	}
	@Override
	public void changeChannel()
	{
		System.out.println("Smart TV Channel is changed");
	}
	public void browse()
	{
		System.out.println("Smart TV is Browsing");
		
	}
}
public class Overriding1
{
	public static void main(String[] args)
	{
		//A smarttv can be every features of normal TV but a normal will not be having every features of smart tv.
		//when a regerence of super class and object of a sub class and you call the method which are overrided method then the method of sub class will be called.
		
		TV t1=new SmartTV(); //this is allowed TV reference can be taken for SmartTV.
		//the method of smart tv will be called because the object is of smarttv.
		//SmartTV st=new TV();	//this is not allowed SmartTV reference cannot be taken for TV
		t1.switchON();
		t1.changeChannel();
		//t2.browse(); //we cannot call browse using TV refrence because it's not present in TV.
		//object is of smarttv and using a refrence of Tv
		//by using super class refrence we can hold the object of a sub class but we can only call those methods which are already defined in super class and we cannot access those methods which are newly defined in sub class.
		
		
	}
}
	