import java.lang.*;
import java.util.*;

class Phone
{
	public void call()
	{
		System.out.println("Phone Call");
	}
	public void sms()
	{
		System.out.println("Phone sending SMS");
	}
}
interface ICamera
{
	void click();
	void record();
}
interface IMusicPlayer
{
	void play();
	void pause();
	void resume();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
	public void videoCall()
	{
		System.out.println("Smart Phone video calling");
	}
	public void click()
	{
		System.out.println("Smart Phone clicking photo");
	}
	public void record()
	{
		System.out.println("Smart Phone recording video");
	}
	public void play()
	{
		System.out.println("Smart Phone playing music");
	}
	public void pause()
	{
		System.out.println("Smart Phone music pause");
	}
	public void resume()
	{
		System.out.println("Smart Phone music resume");
	}
}

public class InterfaceExample
{
	public static void main(String[] args)
	{
		SmartPhone sp=new SmartPhone();
		sp.call();
		sp.sms();
		sp.videoCall();
		sp.click();
		sp.record();
		sp.play();
		sp.resume();
		sp.pause();
	}
}