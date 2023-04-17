package package1;

public class Day_2_assign2 
{
	public int sum(int a, int b)
	{
	int c;
	c= a+b;
	System.out.println("sum result is" + c);
	return c;
	}	
	public int sub(int e, int f)
	{
	int g;
	g=e-f;
	System.out.println("sub result is" + g);
	return g;
	}	
	public int multi(int m, int n)
	{
	int o;
	o=m*n;
	System.out.println("multi result is" + o);
	return o;
	}	
	public void div(int u, int v)
	{
	int w;
	w=u/v;
	System.out.println("final result is" + w);
	}	
	public static void main(String[] args)
	{
		Day_2_assign2 abc = new Day_2_assign2();
		int d = abc.multi(10, 2);
		int h = abc.sub(d,2);
		int i = abc.sum(h, 2);
		int j = abc.sub(i, 2);
		abc.div(j, 2);
	}
}
