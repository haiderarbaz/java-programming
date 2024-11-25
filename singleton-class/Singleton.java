import java.lang.*;
import java.util.*;

class CoffeeMachine
{
	private float coffeeQty;
	private float waterQty;
	private float sugarQty;
	private float milkQty;
	
	static private CoffeeMachine my=null;
	
	private CoffeeMachine()
	{
		coffeeQty=1;
		waterQty=1;
		sugarQty=1;
		milkQty=1;
	}
	private void fillWater(float qty)
	{
		waterQty=qty;
	}
	private void fillSugar(float qty)
	{
		sugarQty=qty;
	}
	private void fillCoffee(float qty)
	{
		coffeeQty=qty;
	}
	private void fillMilk(float qty)
	{
		milkQty=qty;
	}
	public float getCoffee()
	{
		return 0.30f;
	}
	static CoffeeMachine getInstance()
	{
		if(my==null)
			my=new CoffeeMachine();
		return my;
	}
}

public class Singleton
{
	public static void main(String[] args)
	{
		CoffeeMachine m1=CoffeeMachine.getInstance();
		CoffeeMachine m2=CoffeeMachine.getInstance();
		CoffeeMachine m3=CoffeeMachine.getInstance();
		
		System.out.println(m1+" "+m2+" "+m3);
		if(m1==m2 && m2==m3)
			System.out.println("Same");
	}
}