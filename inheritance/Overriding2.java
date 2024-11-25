import java.lang.*;
import java.util.*;

class Car
{
	public void start()
	{
		System.out.println("Car Started");
	}
	public void accelerate()
	{
		System.out.println("Car is Accelerated");
	}
	public void changeGear()
	{
		System.out.println("Car Gear Changed");
	}
}

class LuxaryCar extends Car
{
	public void changeGear()
	{
		System.out.println("Automatic Gear Changed");
	}
	public void openRoof()
	{
		System.out.println("Sun Roof is Opened");
	}
}

public class Overriding2
{
	public static void main(String[] args)
	{
		Car c=new Car();
		c.start();
		c.accelerate();
		c.changeGear();
		
		LuxaryCar lc=new LuxaryCar();
		lc.start();
		lc.accelerate();
		lc.changeGear();
		lc.openRoof();
	}
}