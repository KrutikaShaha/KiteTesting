package simplePrograms;

public class Practiceprogram 
{
	public static void main(String[] args)
	{
		System.out.println("1.Find Largest of Two Numbers ");
		int num1=390;
		int num2=90;
		System.out.println("Number 1= "+num1);
		System.out.println("Number 2= "+num2);
		if(num1>num2)
		{
			System.out.println("Number "+num1+" greater ");
		}
		else
		{
			System.out.println("Number "+num2+" greater ");
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("2.Find Largest of Three Numbers");
		int n1=9000;
		int n2=80;
		int n3=900;
		System.out.println("Number 1 = "+n1);
		System.out.println("Number 2 = "+n2);
		System.out.println("Number 3 = "+n3);
		if(n1>n2 && n1>n3)
		{
			System.out.println("Number "+n1+" is greater");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Number "+n2+" is greater");
		}
		else 
		{
			System.out.println("Number "+n3+" is greater");
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("3.Find Smallest of Three Numbers ");
		int m1=89;
		int m2=67;
		int m3=450;
		System.out.println("Number 1= "+m1);
		System.out.println("Number 2= "+m2);
		System.out.println("Number 3= "+m3);
		if(m1<m2 && m1<m3)
		{
			System.out.println("Number "+m1+" is small");
		}
		else if(m2<m1 && m2<m3)
		{
			System.out.println("Number "+m2+" is small");
		}
		else
		{
			System.out.println("Number "+m3+" is small");
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("4.Java Program to Find GCD of Two Numbers ");
		int a1=30;
		int a2=25;
		int gcd=0;
		for(int i=1;i<a1 && i<a2;i++)
		{
			if(a1%i==0 && a2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD of "+a1+" & "+a2+" is "+gcd);
		System.out.println("----------------------------------------------------");
		
		System.out.println("5.Java Program to Find LCM of Two Numbers");
		int x=24;
		int y=36;
		int gcd1=0;
		int lcm;
		for(int i=1;i<x && i<y ;i++)
		{
			if(x%i==0 && y%i==0)
			{
				gcd1=i;
			}
		}
		lcm=(x*y)/gcd1;
		System.out.println("LCM of "+x+" & "+y+" is "+lcm);
		System.out.println("----------------------------------------------------");
		
		System.out.println("6.Check if a Number is Positive or Negative");
		int b=0;
		if(b>0)
		{
			System.out.println("Number "+b+" is Positive");
		}
		else if(b<0)
		{
			System.out.println("Number "+b+" is Negative");
		}
		else
		{
			System.out.println("Number "+b+" is Zero");
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("7.Check if a Given Number is Perfect Square");
		int c=49;
		for(int i=1;i<c;i++)
		{
			if(i * i == c)
			{
				System.out.println("Number "+c+" is perfect squre of "+i);
			}
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("8.find whether number is odd or even");
		int d=9;
		if(d%2==0)
		{
			System.out.println("Number "+d+" is Even");
		}
		else
		{
			System.out.println("Number "+d+" is Odd");
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("9.Display Even Numbers From 1 to 100");
		for(int i=0;i<100;i=i+2)
		{
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		System.out.println("10.Display Odd Numbers From 1 to 100");
		for(int i=1;i<100;i=i+2)
		{
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		System.out.println("11.Find Sum of first 10 Natural Numbers");
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Addition of first 10 number "+sum);
		System.out.println("----------------------------------------------------");
		
		System.out.println("13.Program for Palindrome Number");
		int a11=279;
		int copy;
		int re=0;
		int rev=0;
		copy=a11;
		System.out.println(" Original number "+a11);
		while(copy!=0)
		{
			re=copy%10;
			rev=(rev*10)+re;
			copy=copy/10;
		}
		System.out.println(" Reverse Number "+rev);
		if(a11==rev)
		{
			System.out.println("Number Is Palindrome");
		}
		else
		{
			System.out.println(" Number is not palindrome");
		}
		System.out.println("----------------------------------------------------");

		System.out.println("14.Program for Factorial of any number");
		int factorial=1;
		int e=4;
		for(int i=1;i<=e;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+factorial);
		System.out.println("----------------------------------------------------");
		
		System.out.println("16.Print ASCII Value in Java");
		int f='A';
		System.out.println("ASCCI value of A is "+f);
		System.out.println("----------------------------------------------------");
		
		System.out.println("17.Program to Swap Two Numbers without using third variable");
		int g=50;
		int h=98;
		System.out.println("Before swapping number g = "+g);
		System.out.println("Before swapping number h = "+h);
		g=g+h;
		h=g-h;
		g=g-h;
		System.out.println("After swapping number g = "+g);
		System.out.println("After swapping number h = "+h);
		System.out.println("----------------------------------------------------");
		
		System.out.println("18.To Find Largest of Four Numbers(use AND/OR Operator)");
		int number1=100;
		int number2=200;
		int number3=300;
		int number4=400;
		System.out.println("Number 1 = "+number1);
		System.out.println("Number 2 = "+number2);
		System.out.println("Number 3 = "+number3);
		System.out.println("Number 4 = "+number4);
		if(number1>number2  && number1>number3  && number1>number4)
		{
			System.out.println("Number 1 = "+number1 +" is Greater ");
		}
		else if(number2>number1  && number2>number3 && number2>number4)
		{
			System.out.println("Number 2 = "+number2+" is Greater ");
		}
		else if(number3>number1 && number3>number2 &&  number3>number4)
		{
			System.out.println("Number 3 = "+number3+" is greater ");
		}
		else 
		{
			System.out.println("Number 4 = "+number4+" is greater ");
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("22.Java Program to Find Square Root of a Number");
		int k=225;
		for(int i=1;i<k;i++)
		{
			if(i*i==k)
			{
				System.out.println("Square root of "+k+" is "+i);
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("23.Reverse the numberr");
		int inputno=151;
		int inputcopy;
		int reminder;
		int reverse=0;
		inputcopy=inputno;
		System.out.println("Number = "+inputno);
		while(inputcopy!=0)
		{
			reminder=inputcopy%10;
			reverse=(reverse*10)+reminder;
			inputcopy=inputcopy/10;
		}
		System.out.println("Reverce = "+reverse);
		System.out.println(" THE END");
		

		

	}

}
