package package1;

public class Day_2_assign1
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
Day_2_assign1 abc = new Day_2_assign1();
int d = abc.sum(10, 2);
int h = abc.sum(d, 2);
int i = abc.sub(h, 2);
int p = abc.multi(i, 2);
abc.div(p, 2);

}


}
