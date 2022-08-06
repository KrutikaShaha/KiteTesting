package Access_modifier1;

public class AccessModifier2 
{
	public static String name="Krutika";
	public long m=9730609769l;
	public static void method()
	{
		System.out.println("Public static method");
	}
	public void method1()
	{
		System.out.println("public non static method ");
	}
	static int a=10;
	char k='k';
	static void method2()
	{
		System.out.println("Default static method ");
	}
	void method3()
	{
		System.out.println("Default non static method");
	}
	protected static byte x=11;
	protected float y=10.22f;
	protected static void method4()
	{
		System.out.println("Protected static method");
	}
	protected void method5()
	{
		System.out.println("Protected non static method");
	}
	private static double z=9.99d;
	private String l="Love";
	private static void method6()
	{
		System.out.println("private static method");
	}
	private void method7()
	{
		System.out.println("Private non static method");
	}
	public static void main(String[] args)
	{
		//private
		System.out.println(z);
		method6();
		AccessModifier2 obj=new AccessModifier2();
		System.out.println(obj.l);
		obj.method7();
		//Default
		System.out.println(a);
		System.out.println(obj.k);
		method2();
		obj.method3();
		//protected
		System.out.println(x);
		System.out.println(obj.y);
		method4();
		obj.method5();
		//public 
		System.out.println(name);
		method();
		System.out.println(obj.m);
		obj.method1();
		
	}
	
	
	
	

}
