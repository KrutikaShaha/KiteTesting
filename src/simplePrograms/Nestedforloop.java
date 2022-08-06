package simplePrograms;

public class Nestedforloop 
{
	public static void main(String[] args) 
	{
		for(int Month=1;Month<=12;Month++)
		{
			System.out.println("month "+Month);
			System.out.println();
			for(int week=1;week<=4;week++)
			{
				System.out.println("week "+week);
				for(int day=1;day<=7;day++)
				{
					System.out.println("Day "+day);
				}
			}
		}
		
	}

}
