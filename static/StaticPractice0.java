import java.lang.*;
import java.util.*;

class HondaCity
{
	static long price=1000000;
	int a,b;
	static double OnRoadPrice(String city)
	{
		switch(city)
		{
			case "Delhi":
				return price+price*0.1;
			case "Mumbai":
				return price+price*0.09;
			default:
				return price+price*0.08;
		}
	}				
}
public class StaticPractice0
{
	public static void main(String[] args)
	{
		HondaCity h1=new HondaCity();
		HondaCity h2=new HondaCity();
		System.out.println(h1.price);
		System.out.println(h2.price);
		h1.price=2000000;
		System.out.println(h1.price);
		System.out.println(h2.price);
		System.out.println(HondaCity.price);
		System.out.println(HondaCity.OnRoadPrice("Delhi"));
		System.out.println(HondaCity.OnRoadPrice("Mumbai"));
		System.out.println(HondaCity.OnRoadPrice("default"));
	}
}