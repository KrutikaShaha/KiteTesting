package InterfacePractice;

public interface Interfacep 
{
	//1.case static not allow 
	public static void method1()
	{
		System.out.println("hello people");
	}
	
	//2.
	public void method2();
	
	
	//3.cant write complete method
//	public void method3()
//	{
//		System.out.println("complete Method");
//	}
	
	//4.
	public String method4();
	
	//5.
	char method5();
	//6. system define method and method body can write and execute
	public static void main(String[] args) 
	{
		System.out.println("Hieeee ");
		method1();
			
	}
}
