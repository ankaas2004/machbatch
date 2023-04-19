package package1;

public class Day3_Constuctor 
{
	public Day3_Constuctor() 
	{
		this(23,34,45);
	System.out.println("Default construtor");	
	}
	public Day3_Constuctor(int a) 
	{
		this(23,34,23,34);
	System.out.println("1 parameterized construtor");	
	}
	public Day3_Constuctor(int a, int b)
	{
		this();
	System.out.println("2 parameterized constructor");
	}
	public Day3_Constuctor(int a, int b, int c) 
	{
	System.out.println("3 parameterized construtor");	
	}
	public Day3_Constuctor(int a, int b, int c, int d) 
	{
		this (23,34);
	System.out.println("4 parameterized construtor");	
	}
	public static void main(String[] args) 
	{
	Day3_Constuctor abc=new Day3_Constuctor(23);	
			
	}
}
