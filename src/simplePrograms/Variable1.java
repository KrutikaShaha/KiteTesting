package simplePrograms;

public class Variable1 
{
	//1 . static globle variable
	static double a=10.10d;
	static String d="I will";
	//2. Non static Globle variable
	int c=25;
	char x='l';
	public Variable1()//constructor 
	{
	System.out.println("In First constructor");	
	}
	public Variable1(int x) 
	{
	System.out.println("In second constructor");	
	}
	public Variable1(String z,char j )
	{
		System.out.println("in third constructor");
	}
	public static void main(String[] args) 
	{
		long g=9876432100l;
		System.out.println("Local variable "+g);
		Variable1 obj=new Variable1();
		System.out.println("Static double value "+Variable1.a);
		System.out.println("Static string is "+d);
		System.out.println("Charactor  ="+obj.x);
		System.out.println("interger no is "+obj.c);
		Variable1 obj1=new Variable1(22);
		Variable1 obj2=new Variable1("ABC",'b');
	}

}
