import java.lang.*;
import java.util.*;

class Subject
{
	private String subId;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	public Subject(String sbId, String n)
	{
		subId=sbId;
		name=n;
	}
	public Subject(String sbId, String n, int maxMark)
	{
		subId=sbId;
		name=n;
		maxMarks=maxMark;
	}
	public Subject(String sbId, String n, int maxMark, int markObtain)
	{
		subId=sbId;
		name=n;
		maxMarks=maxMark;
		marksObtain=markObtain;
	}
	
	public String getSubId()
	{
		return subId;
	}
	public String getName()
	{
		return name;
	}
	public int getMaxMarks()
	{
		return maxMarks;
	}
	public int getMarksObtain()
	{
		return marksObtain;
	}
	
	public void setMaxMarks(int maxMark)
	{
		maxMarks=maxMark;
	}
	public void setMarksObtain(int markObtain)
	{
		marksObtain=markObtain;
	}
	boolean isQualified()
	{
		return marksObtain>=maxMarks/10*4;
	}
	
	public String toString()
	{
		return "\nSubject Id: "+subId+"\nName: "+name+"\nMaximum Marks: "+maxMarks+"\nMarks Obtain: "+marksObtain;
	}
}

class Student
{
	private String rollNo;
	private String name;
	private String department;
	private String subjects;
	
	public Student(String rolNo, String nam)
	{
		rollNo=rolNo;
		name=nam;
	}
	public Student(String rolNo, String nam, String dpt, String subject)
	{
		rollNo=rolNo;
		name=nam;
		department=dpt;
		subjects=subject;
	}
	
	public String getRollNo(String rolNo)
	{
		return rollNo;
	}
	public String getName(String nam)
	{
		return name;
	}
	public String getDepartment(String dpt)
	{
		return department;
	}
	public String getSubjects(String subject)
	{
		return subjects;
	}
	
	public void setDepartment(String dpt)
	{
		department=dpt;
	}
	public void setSubjects(String subject)
	{
		subjects=subject;
	}
	public String toString()
	{
		return "\nRoll No: "+rollNo+"\nName: "+name+"\nDepartment: "+department+"\nSubjects: "+subjects;
	}
}
class SubjectStudentDetails
{
	public static void main(String[] args)
	{
		Subject sub1 = new Subject("10PHY2019","Saahil",100,80);
		
		System.out.println("Marks Obtains By Saahil: "+sub1.getMarksObtain());
		
		System.out.println("Subject Details:\n "+ sub1 );
		
		Subject sub[]=new Subject[4];
		sub[0]=new Subject("s101","DS",100,80);
		sub[1]=new Subject("s102","Algorith",100,78);
		sub[2]=new Subject("s103","Operating System",100,75);
		sub[3]=new Subject("s104","Networking",100,71);
		
		for(Subject s:sub) //subject s from subs
			System.out.println(s);
			
		Student stu = new Student("1KT16CV010", "Arbaz", "Civil", "Fluid Mechanics");
		System.out.println("Student Details:\n "+ stu );
		
		Student stu1[]=new Student[4];
		stu1[0]=new Student("1KT16CV010","Arbaz","Civil","Fluid Mechanics");
		stu1[1]=new Student("1KT16CV047","Faizan","Civil","CAD");
		stu1[2]=new Student("1KT16IS077","Abhijeet","IS","Programming");
		stu1[3]=new Student("1KT16IS088","Helal","IS","Database");
		
		for(Student s:stu1) //student s from stu
			System.out.println(s);
	}
}