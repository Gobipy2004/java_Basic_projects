import java.util.Scanner;
class cal
{
	static Scanner cal = new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\n\t\t\t*******Simple Calculator*******");
		System.out.print("\n\t\tEnter A Number: ");
		int a = cal.nextInt();
		System.out.print("\n\t\tEnter B number: ");
		int b = cal.nextInt();
		boolean lator = true;
		do
		{
			
			
			System.out.println("\n\t\t+.Addition\n\t\t-.Subtraction\n\t\t*.Multipulication\n\t\t/.Division\n\t\t%.Modulus");
			System.out.print("\n\t\t\tEnter Operator: ");
			char op = cal.next().charAt(0);
			switch (op)
			{
			case '+'->{
				System.out.println("\t\t\tAddition :"+(a+b));
			}
			case '-'->{
				System.out.println("\t\t\tSubtraction :"+(a-b));
			}
			case '*'->{
				System.out.println("\t\t\tMutiplication :"+(a*b));
			}
			case '/'->{
				System.out.println("\t\t\tDivision :"+(a/b));
			}
			case '%'->{
				System.out.println("\t\t\tModulas :"+(a%b));
			}
			
			
			}
			System.out.println("\n\t\t\t1.Continue\n\t\t\t2.Exit");
			System.out.print("\n\t\t\tEnter Above options: ");
			int option = cal.nextInt();
			if (option==2)
			{
				lator=false;
			}
			else
				if (option==1)
				{
					System.out.print("\n\t\tEnter A Number: ");
					 a = cal.nextInt();
					System.out.print("\n\t\tEnter B number: ");
					 b = cal.nextInt();
				}
				
		}
		while (lator);
		System.out.println("Thank You");
		
	}
}
