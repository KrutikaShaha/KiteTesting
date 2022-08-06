package InterfacePractice;

public class concreateclASS implements Interfacep 
{

	@Override
	public void method2() 
	{
		System.out.println("metho2 no return type");
	}

	@Override
	public String method4() 
	{
		System.out.println("method4 String return typr ");
		return "Krutika";
	}

	@Override
	public char method5() 
	{
		System.out.println("Method5 Char return type");
		return 'K';
	}
	public static void main(String[] args) 
	{
		concreateclASS c=new concreateclASS();
		c.method2();
		c.method4();
		c.method5();
		
		
	}
	

}
