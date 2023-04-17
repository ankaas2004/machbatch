package package1;

public class Student_1 
{
	
	int age,rollnumber;
	public void display1() 
	{
	System.out.println("Welcome to all");
	}
	public void display() 
	{
	System.out.println("automation is very easy");
	}
	public static void main(String[] args) 
	{
	Student_1 abc= new Student_1();
	abc.display();
	abc.display1();
	abc.age = 12;
	abc.rollnumber = 32;
	System.out.println(abc.age);
	System.out.println(abc.rollnumber);
			
	}
}
