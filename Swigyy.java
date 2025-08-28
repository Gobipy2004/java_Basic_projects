import java.util.Scanner;
class Swigyy
{
	static Scanner sw = new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		//Log-in page
		System.out.println("\n\t\t\t****Welcome To Swigyy****");
		System.out.println("\n\t\t\t\tLog-In Form");
		System.out.println("\t\t\t1.Sing-in\t|\t2.sing-up");
		System.out.print("Enter Log-In Option: ");
		int log=sw.nextInt();
		switch (log)
		{
		case 1->{
			System.out.println("Processing.....");
			Thread.sleep(3000);
			System.out.println("Already You Have Account.....");
			System.out.println("\n\t\t\tHotels Name:\n1.A2b\n2.Pams\n3.Kfc");
			System.out.print("\t\t\tEnter Hotel id:");
			int hotel = sw.nextInt();
			switch (hotel)
			{
			case 1->{
				//a2b hotel
				System.out.println("Welcome To A2b Hotel");
				System.out.println("\tMenu:\n\t1.Sambar Rice\n\t2.Dosa\n\t3.Vada\n\t4.Idly");
				System.out.print("\t\t\tEnter Food Id:"); 
				int a2b = sw.nextInt();
				switch (a2b)
				{
				case 1->{
					//Sambar Rice
					System.out.println("Processing.....");
					Thread.sleep(3000);
					System.out.println("\t\t\tYou Selected Sambar Rice");
					double amount=60;
					System.out.println("\t\t\tSambar Rice Price:"+amount);
					System.out.print("\n\t\t\tEnter quantity of Sambar rice:");
					int sr=sw.nextInt();
					amount*=sr;
					System.out.println("Processing.....");
					Thread.sleep(3000);
					System.out.println("Total Bill Amount:"+amount);
					System.out.print("To Confirm Your Order Enter Amount Here:");
					double con=sw.nextDouble();
					if (con==amount)
					{
						int aotp=(int)(Math.random()*9999+9999);
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Your OTP is:"+aotp);
						System.out.print("\n\t\t\tEnter OTP here:");
						int a2=sw.nextInt();
						if (a2==aotp)
						{
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
						}
						else
						{
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("OTP is NOT Match");
						}
					}
					else
					{
						System.out.println("Amount does not match");
					}
					}
					case 2->{
						//Dosa
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Dosa");
						double amount=30;
						System.out.println("\t\t\tDosa Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Dosa:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 3->{
						//vada
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Vada");
						double amount=12;
						System.out.println("\t\t\tVada Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of vada:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 4->{
						//Idly
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Idly");
						double amount=10;
						System.out.println("\t\t\tIdly Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Idly:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
				}
			}	
				
				case 2->{
					//Pams hotel
					System.out.println("Welcome To Pams Hotel");
					System.out.println("\tMenu:\n\t1.Chiken Biriyani\n\t2.Mutton Biriyani\n\t3.Chiken 65\n\t4.Fish fry");
					System.out.print("\t\t\tEnter Food Id:"); 
					int pams = sw.nextInt();
					switch (pams)
					{
					case 1->{
						//Chiken Biriyani
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken Biriyani");
						double amount=150;
						System.out.println("\t\t\tChiken Biriyani Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Sambar rice:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
						
					}
					case 2->{
						//Mutton Biriyani
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Mutton Biriyani");
						double amount=200;
						System.out.println("\t\t\tMutton Biriyani Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Mutton Biriyani:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 3->{
						//Chiken 65
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken 65");
						double amount=50;
						System.out.println("\t\t\tChiken 65 Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chiken 65:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 4->{
						//Fish Fry
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Fish Fry");
						double amount=50;
						System.out.println("\t\t\tFish Fry Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Fish Fry:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
				}
			}
				case 3->{
					//Kfc
					System.out.println("Welcome To Kfc Hotel");
					System.out.println("\tMenu:\n\t1.Fried Chiken\n\t2.Chiken Lalipop\n\t3.Chiken Burger\n\t4.Chesee Pizza");
					System.out.print("\t\t\tEnter Food Id:"); 
					int kfc = sw.nextInt();
					switch (kfc)
					{
					case 1->{
						//Fried Chiken
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Fried Chiken");
						double amount=199;
						System.out.println("\t\t\tFried Chiken Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Fried Chiken:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Kfc Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
						
					}
					case 2->{
						//Chiken Lalipop
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken Lalipop");
						double amount=250;
						System.out.println("\t\t\tDosa Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chiken Lalipop:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Kfc Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 3->{
						//Chiken Burger
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken Burger");
						double amount=99;
						System.out.println("\t\t\tChiken Burger Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chiken Burger:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Kfc Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 4->{
						//Chesee Pizza
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chesee Pizza");
						double amount=100;
						System.out.println("\t\t\tChesee Pizza Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chesee Pizza:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
				  }
				}
			  }
			}
			
		
		
		case 2->{
			System.out.print("Enter Mobile Number: ");
			long phone = sw.nextLong();
			if (phone>=1000000000l&&phone<=9999999999l)
			{
			
				System.out.print("Enter Age: ");
				int age=sw.nextInt();
				if (age>=18)
				{
					int otp=(int)(Math.random()*9999+9999);
					System.out.println("Processing....");
					Thread.sleep(3000);
					System.out.println(otp+" :Your OTP");
					System.out.print("\nEnter Your OTP:");
					int yotp=sw.nextInt();
					if (otp==yotp)
			{
				System.out.println("Account Created Successfull");
				//Log-in page end here
				
				//hotel names
				System.out.println("\n\t\t\tHotels Name:\n1.A2b\n2.Pams\n3.Kfc");
				System.out.print("\t\t\tEnter Hotel id:");
				int hotel = sw.nextInt();
				switch (hotel)
				{
				case 1->{
					//a2b hotel
					System.out.println("Welcome To A2b Hotel");
					System.out.println("\tMenu:\n\t1.Sambar Rice\n\t2.Dosa\n\t3.Vada\n\t4.Idly");
					System.out.print("\t\t\tEnter Food Id:"); 
					int a2b = sw.nextInt();
					switch (a2b)
					{
					case 1->{
						//Sambar Rice
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Sambar Rice");
						double amount=60;
						System.out.println("\t\t\tSambar Rice Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Sambar rice:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
						
					}
					case 2->{
						//Dosa
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Dosa");
						double amount=30;
						System.out.println("\t\t\tDosa Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Dosa:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 3->{
						//vada
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Vada");
						double amount=12;
						System.out.println("\t\t\tVada Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of vada:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 4->{
						//Idly
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Idly");
						double amount=10;
						System.out.println("\t\t\tIdly Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Idly:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					}
					
				}
				case 2->{
					//Pams hotel
					System.out.println("Welcome To Pams Hotel");
					System.out.println("\tMenu:\n\t1.Chiken Biriyani\n\t2.Mutton Biriyani\n\t3.Chiken 65\n\t4.Fish fry");
					System.out.print("\t\t\tEnter Food Id:"); 
					int pams = sw.nextInt();
					switch (pams)
					{
					case 1->{
						//Chiken Biriyani
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken Biriyani");
						double amount=150;
						System.out.println("\t\t\tChiken Biriyani Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Sambar rice:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
						
					}
					case 2->{
						//Mutton Biriyani
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Mutton Biriyani");
						double amount=200;
						System.out.println("\t\t\tMutton Biriyani Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Mutton Biriyani:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 3->{
						//Chiken 65
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken 65");
						double amount=50;
						System.out.println("\t\t\tChiken 65 Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chiken 65:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 4->{
						//Fish Fry
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Fish Fry");
						double amount=50;
						System.out.println("\t\t\tFish Fry Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Fish Fry:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Pams Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					}
				}
				case 3->{
					//Kfc
					System.out.println("Welcome To Kfc Hotel");
					System.out.println("\tMenu:\n\t1.Sambar Rice\n\t2.Dosa\n\t3.Vada\n\t4.Idly");
					System.out.print("\t\t\tEnter Food Id:"); 
					int kfc = sw.nextInt();
					switch (kfc)
					{
					case 1->{
						//Fried Chiken
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Fried Chiken");
						double amount=199;
						System.out.println("\t\t\tFried Chiken Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Fried Chiken:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Kfc Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
						
					}
					case 2->{
						//Chiken Lalipop
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken Lalipop");
						double amount=250;
						System.out.println("\t\t\tDosa Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chiken Lalipop:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Kfc Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 3->{
						//Chiken Burger
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chiken Burger");
						double amount=99;
						System.out.println("\t\t\tChiken Burger Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chiken Burger:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in Kfc Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					case 4->{
						//Chesee Pizza
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("\t\t\tYou Selected Chesee Pizza");
						double amount=100;
						System.out.println("\t\t\tChesee Pizza Price:"+amount);
						System.out.print("\n\t\t\tEnter quantity of Chesee Pizza:");
						int sr=sw.nextInt();
						amount*=sr;
						System.out.println("Processing.....");
						Thread.sleep(3000);
						System.out.println("Total Bill Amount:"+amount);
						System.out.print("To Confirm Your Order Enter Amount Here:");
						double con=sw.nextDouble();
						if (con==amount)
						{
							int aotp=(int)(Math.random()*9999+9999);
							System.out.println("Processing.....");
							Thread.sleep(3000);
							System.out.println("Your OTP is:"+aotp);
							System.out.print("\n\t\t\tEnter OTP here:");
							int a2=sw.nextInt();
							if (a2==aotp)
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("\n\t\t\tYour Order Placed Successfully,Thanks For Ordering in A2b Hotel");
							}
							else
							{
								System.out.println("Processing.....");
								Thread.sleep(3000);
								System.out.println("OTP is NOT Match");
							}
						}
						else
						{
							System.out.println("Amount does not match");
						}
					}
					}
				}
				}
			}
			else
			{
				System.out.println("OTP is Not Matched");
			}
			
				}
				else
				{
					System.out.println("age must be 18 or greater than 18");
				}
				
			}
			else
			{
				System.out.println("\t10 digits must");
			}
			
		
		}
		
		}
		
		
	}
}
