import java.util.Scanner;

public class Main
	{
		
		static String name;
		static int playerLevel;
		static int playerHealth;
		static int playerStrength;
		static int playerDexterity;
		static double playerXP;
		
		public static void main(String [] args)
		{
			intro();
			stats();
		}
		
		@SuppressWarnings({ "resource", "unused" })
		public static void intro()
			{
				Scanner userStringInput = new Scanner(System.in);
				Scanner userIntInput = new Scanner(System.in);

				System.out.println("Welcome!");
				Delay.delay2();
				System.out.println("When you are ready, enter your name:");
				name = userStringInput.nextLine();
				System.out.println("Hello " + name );
				System.out.println(" ");
				Delay.delay2();
			}
		
		public static void stats()
			{
				System.out.println(name + "'s Stats: ");
				Delay.delay1();
				System.out.println("-------------------");
				Delay.delay1();
				System.out.println("Level: " + playerLevel);
				Delay.delay1();
				System.out.println("Amount of EXP: " + playerXP);
				Delay.delay1();
				System.out.println("Health: " + playerHealth);
				Delay.delay1();
				System.out.println("Strength: " + playerStrength);
				Delay.delay1();
				System.out.println("Dexterity: " + playerDexterity);
				Delay.delay1();
				System.out.println("-------------------");
				System.out.println(" ");
			}
		
		public static void start()
			{
				System.out.println("test");
			}
		
		
		

	}
