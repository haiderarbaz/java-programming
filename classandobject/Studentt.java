import java.lang.*;
import java.util.*;

//class Student

//Properties:
//roll
//name
//course
//m1,m2,m3

//Methods:
//total()
//average()
//grade()

class Student
{
	public int roll;
	public String name;
	public String course;
	public double m1,m2,m3;
	
	public double total()
	{
		return m1+m2+m3;
	}
	public double average()
	{
		return total()/3;
	}
	public char grade()
	{
		if(average()>=60)
			return 'A';
		else
			return 'B';
	}
	public String details()
	{
		return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
	public String toString()
	{
		return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
}

public class Studentt
{
	public static void main(String[] args)
	{
		Student s = new Student();
		
		s.roll=1;
		s.name="Mark";
		s.course="CSE";
		s.m1=70;
		s.m1=80;
		s.m1=65;
		
		System.out.println("Total: "+s.total());
		System.out.println("Average: "+s.average());
		System.out.println("Grade: "+s.grade());
		System.out.println("Details:\n "+s.details());
		
		System.out.println("Details:\n "+ s ); //here we are giving directly refrence of an object.
		//it is calling toString method.
		//if you want to print the object itself then the object should have toString method implemented. if to string method is there, then automatically it will be called by println method. You give the object name, you give the refrence of an object, it will call toString method of that object. 
	}
}