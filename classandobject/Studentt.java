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
		Scanner scn=new Scanner(System.in);

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		System.out.print("Enter your Roll: ");
		s1.roll=scn.nextInt();
		System.out.println("Enter your Name: ");
		s1.name=scn.nextLine();
		scn.nextLine();
		System.out.println("Enter your Course: ");
		s1.course=scn.nextLine();
		System.out.print("Enter your m1 marks: ");
		s1.m1=scn.nextDouble();
		System.out.print("Enter your m2 marks: ");
		s1.m2=scn.nextDouble();
		System.out.print("Enter your m3 marks: ");
		s1.m3=scn.nextDouble();

		System.out.println("Total: "+s1.total());
		System.out.println("Average: "+s1.average());
		System.out.println("Grade: "+s1.grade());
		System.out.println("Details:\n "+s1.details());
		
		System.out.println("Details:\n "+ s1 ); //here we are giving directly refrence of an object.
		//it is calling toString method.
		//if you want to print the object itself then the object should have toString method implemented. if to string method is there, then automatically it will be called by println method. You give the object name, you give the refrence of an object, it will call toString method of that object.
		
		System.out.print("Enter your Roll: ");
		s2.roll=scn.nextInt();
		System.out.println("Enter your Name: ");
		s2.name=scn.nextLine();
		scn.nextLine();
		System.out.println("Enter your Course: ");
		s2.course=scn.nextLine();
		System.out.print("Enter your m1 marks: ");
		s2.m1=scn.nextDouble();
		System.out.print("Enter your m2 marks: ");
		s2.m2=scn.nextDouble();
		System.out.print("Enter your m3 marks: ");
		s2.m3=scn.nextDouble();

		System.out.println("Total: "+s2.total());
		System.out.println("Average: "+s2.average());
		System.out.println("Grade: "+s2.grade());
		System.out.println("Details:\n "+s2.details());
		
		System.out.println("Details:\n "+ s2 );
		
		System.out.print("Enter your Roll: ");
		s3.roll=scn.nextInt();
		System.out.println("Enter your Name: ");
		s3.name=scn.nextLine();
		scn.nextLine();
		System.out.println("Enter your Course: ");
		s3.course=scn.nextLine();
		System.out.print("Enter your m1 marks: ");
		s3.m1=scn.nextDouble();
		System.out.print("Enter your m2 marks: ");
		s3.m2=scn.nextDouble();
		System.out.print("Enter your m3 marks: ");
		s3.m3=scn.nextDouble();
		
		// s.roll=1;
		// s.name="Mark";
		// s.course="CSE";
		// s.m1=70;
		// s.m1=80;
		// s.m1=65;
		
		System.out.println("Total: "+s3.total());
		System.out.println("Average: "+s3.average());
		System.out.println("Grade: "+s3.grade());
		System.out.println("Details:\n "+s3.details());
		
		System.out.println("Details:\n "+ s3 );
		
		scn.close();
	}
}