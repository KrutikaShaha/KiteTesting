package simplePrograms;

public class Main_Overloading 
{

	public static void main(String... args) 
	{
		System.out.println("main method with string []");
		main();
		main("Krutika");
		
	}
	public static void main(String args)
	{
		System.out.println("main method with string args");
	}
	public static void main()
	{
		System.out.println("main method without argument");
	}
}
