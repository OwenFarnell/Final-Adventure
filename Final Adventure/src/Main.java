import java.util.Scanner;

public class Main
	{
		static String name;
		
		public static void main(String [] args)
		{
			intro();
		}
		
		public static void intro()
			{
				
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);

				System.out.println("Welcome!");
				Delay.delay1();
				System.out.println("When you are ready, enter your name:");
				name = userStringInput.nextLine();
				System.out.println("Hey " + name + ". Welcome.");
				Delay.delay1();
				System.out.println("hi");
			}
		
		
		
	}
