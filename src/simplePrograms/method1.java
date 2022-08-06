package simplePrograms;

public class method1 
{
	//static, Non return data type,Non argument 
	public static void addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(" Addition is "+c);
	}
	//non static non retun type without argument
	public void add()
	{
		int a=10;
		int b=90;
		int c=a+b;
		System.out.println("Addition is "+c);
	}
	public static void main(String[] args) 
	{
		//1.static non retuen without argument
		//call directly
		addition();
		//by class name
		method1.addition();
		//Non static anon return without argument
		//no static method call by object
		method1 obj=new method1();
		obj.add();
		
	}

}
