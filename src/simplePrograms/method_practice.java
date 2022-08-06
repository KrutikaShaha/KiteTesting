package simplePrograms;

public class method_practice 
{
	//constructor overloading
	public method_practice()
	{
		System.out.println("in Constructor 1");
	}
	public method_practice(int s)
	{
		System.out.println("In constructor 2");
	}
	public method_practice(char y)
	{
		System.out.println("In constructor 3");
	}
	public method_practice(String w)
	{
		System.out.println("in Constructor 4");
	}
	
	//static methods
	//1. static ,no return type , without argument
	public static void method()
	{
		System.out.println("method overloading");
		System.out.println("Public static non retun type without argument method");
	}
	//2.static , no return type , with argument 
	public static void method(char c)
	{
		System.out.println("Method Overloading");
		System.out.println("public static non return type with argument method");
	}
	public static int method1()
	{
		int a=10;
		System.out.println("Public static return type without argument method");
		return a;
	}
	public static int method(int x,int y)
	{
		System.out.println("method overloading");
		System.out.println("public static return type with argument method");
		return x+y;
	}
	public static void main(String[] args) 
	{
		//static method can be call directly or with class name
		System.out.println();
		System.out.println("----------------static method practice----------------");
		method();
		System.out.println();
		method('k');
		System.out.println();
		method1();
		System.out.println();
		method(8,9);
		System.out.println();
		System.out.println("----------------non static method practice----------------");
		System.out.println();
		//non static element call with help oh object 
		method_practice mp=new method_practice();
		System.out.println();
		mp.method2();
		System.out.println();
		method_practice mp1=new method_practice(7);
		System.out.println();
		mp1.method2('l');
		System.out.println();
		method_practice mp3=new method_practice('h');
		System.out.println();
		mp3.method2(10.3f,23.6f);
		System.out.println();
		method_practice mp4=new method_practice("Krutika");
		System.out.println();
		mp4.method3();
		

		
	}
	//non static method 
	//1.non Static,not return,no argument
	public void method2()
	{
		System.out.println("Method overloading");
		System.out.println("public non static no return type no argument");
	}
	public void method2(char g)
	{
		System.out.println("method overloading");
		System.out.println("public non static no return type no argument ");
	}
	public String method3()
	{
		System.out.println("public non static return type no argument method");
		return "krutika";
	}
	public double method2(float d, float c)
	{
		System.out.println("method overloading");
		System.out.println("public non static return type with argument");
		return 20.8;
	}

}
