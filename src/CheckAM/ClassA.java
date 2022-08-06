package CheckAM;

import Access_modifier1.AccessModifier2;

public class ClassA extends AccessModifier2
{

	public static void main(String[] args) 
	{
//		//Default
//		System.out.println(AccessModifier2.a);
//		System.out.println(obj.k);
//		AccessModifier2.method2();
//		obj.method3();
		//protected
		ClassA a=new ClassA();
		System.out.println(AccessModifier2.x);
		System.out.println(a.y);
		AccessModifier2.method4();
		a.method5();
		//public 
		AccessModifier2 ac=new AccessModifier2();
		System.out.println(AccessModifier2.name);
		AccessModifier2.method();
		System.out.println(ac.m);
		ac.method1();
		
		
	}
}
