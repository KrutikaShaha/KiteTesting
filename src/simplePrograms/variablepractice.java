package simplePrograms;

public class variablepractice
{
	//non static global variable
		int a=10; //Global
		String s="Krutika ";
		//static Global Variable
		static long mob=9730609769l;
		static char x='p';
		public static void main(String[] args) 
		{
			int b=20; //Local 
			System.out.println("Variable b= "+b);
			variablepractice obj =new variablepractice();
			System.out.println(obj.s);
			System.out.println("My mobile number is "+mob);
			System.out.println("Pooja starts with "+variablepractice.x);
		}

}
