package Access_modifier1;

public class Access_modifier1 
{
	public static void main(String[] args) 
	{
		//private
//				System.out.println(AccessModifier2.z);
//				method6();
				AccessModifier2 obj=new AccessModifier2();
//				System.out.println(obj.l);
//				obj.method7();
				//Default
				System.out.println(AccessModifier2.a);
				System.out.println(obj.k);
				AccessModifier2.method2();
				obj.method3();
				//protected
				System.out.println(AccessModifier2.x);
				System.out.println(obj.y);
				AccessModifier2.method4();
				obj.method5();
				//public 
				System.out.println(AccessModifier2.name);
				AccessModifier2.method();
				System.out.println(obj.m);
				obj.method1();
				
		
	}

}
