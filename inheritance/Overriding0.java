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
public class Overriding0
{
	public static void main(String[] args)
	{
		TV t1=new TV();
		t1.switchON();
		t1.changeChannel();
		
		SmartTV t2=new SmartTV();
		t2.switchON();
		t2.changeChannel();
		t2.browse();
	}
}
	