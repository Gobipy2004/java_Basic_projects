import java.util.Scanner;
class Magicnumber
{
	static Scanner mn = new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\n\t\t\tMagicNumber Game");
		int sys=(int)(Math.random()*100);
		//System.out.println(sys);
		System.out.println("\n\t\t\tGame Staring....");
		Thread.sleep(2000);
		boolean num=true;
		
		do
		{
			//int system_number=(int)(Math.random()*100);
			System.out.print("\n\t\t\tEnter Your Gussing Number:");
			int guss=mn.nextInt();
			if (guss<sys)
			{
				System.out.println("\n\t\t\tLow");
			}
			else if (guss>sys)
			{
				System.out.println("\n\t\t\tHigh");
			}
			else
			{
				System.out.println("\n\t\t\t*******Perfect********");
				System.out.println("\n\t\t\tEnter option:\n\t\t1.Continue The game\n\t\t2.Exit");
				System.out.print("enter option:");
				int op=mn.nextInt();
				if (op==2)
				{
					num=false;	
				}
				else
				{
					if (op==1)
					{
						sys=(int)(Math.random()*100);
					}
				}
			}
		}
		while (num);
	}
}
