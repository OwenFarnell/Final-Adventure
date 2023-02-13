import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
	{
		
		static String name;
		static int playerLevel;
		static int playerHealth;
		static int playerStrength;
		static int playerDexterity;
		static double playerXP;
		static Player player1;
		static Scanner file;
		static Monster[] monsters = new Monster[5];
		public static void main(String [] args) throws FileNotFoundException
		{
			file = new Scanner(new File("monsters.txt"));
			intro();
			createMonstersAndHero();
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
				System.out.println("Level: " + player1.getLevel());
				Delay.delay1();
				System.out.println("Amount of EXP: " + player1.getXp() + "/" + player1.getXpToNextLvl());
				Delay.delay1();
				System.out.println("Health: " + player1.getHealth());
				Delay.delay1();
				System.out.println("Strength: " + player1.getStrength());
				Delay.delay1();
				System.out.println("Dexterity: " + player1.getDexterity());
				Delay.delay1();
				System.out.println("-------------------");
				System.out.println(" ");
			}
		
		public static void start()
			{
				System.out.println("test");
			}
		
		public static void createMonstersAndHero()
		{
			player1 = new Player(name, 20, 5, 5, 1, 10,0);
			fillMonsters(file);
		}
		
		public static void fillMonsters(Scanner b)
		{
			int numberOfLines = b.nextInt();

			for (int i = 0; i < numberOfLines; i++)
				{
					String Name = b.next();
					int c = b.nextInt();
					int l = b.nextInt();
					int h = b.nextInt();
					int d = b.nextInt();
					monsters[i] = new Monster(Name, c, l, h, d);

				}
		}
		
		

	}
