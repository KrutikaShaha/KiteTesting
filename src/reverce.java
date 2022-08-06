
public class reverce 
{
	public static void main(String[] args) 
	{
		//String="Krutika";
		int a=212;
		int r=0;
				int re=0;
		while(a!=0)
		{
			re=a%10;
			r=r*10+re;
			System.out.println(" "+r);
			a=a/10;
		}
		System.out.println(" "+r);
		
		
		
	}

}
