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
		static boolean stillAlive = true;
		static boolean ranAway = true;
		static boolean gaming = true;
		static int monsterHealth;
		static Monster[] monsters = new Monster[5];
		public static void main(String [] args) throws FileNotFoundException
		{
			file = new Scanner(new File("monsters.txt"));
			intro();
			createMonstersAndHero();
			while(gaming) {
			stats();
			mainMenu();
			}
			
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
				System.out.println("Level: " + player1.getLevel() + "    $"+player1.getGold());
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
			player1 = new Player(name, 20, 5, 5, 1, 10,0,0,20);
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
					int g = b.nextInt();
					int t = b.nextInt();
					monsters[i] = new Monster(Name, c, l, h, d,g,t);

				}
		}
		public static void mainMenu()
		{
			System.out.println("What would you like to fight?\n   (1) Slime\n   (2) Goblin\n   (3) Troll\n   (4) Dragon\n   (5) Demon Lord\n\n");
			System.out.println("   (6) Shop        (7)Stats");
			System.out.println("         (8)End Game");
			Scanner userInput = new Scanner(System.in);
			int input = userInput.nextInt();
			
			if(input == 1 || input == 2 || input == 3 || input == 4|| input == 5)
				{
					enemyFight(input);
				}
		}
		
		public static void enemyFight(int input)
			{
				int enemyNumber = input-1;
				System.out.println("");
				System.out.println("");
				System.out.println("You encounter a lvl "+monsters[enemyNumber].getLevel()+" "+monsters[enemyNumber].getType()+"!\n");
				stillAlive = true;
				ranAway = true;
				playerHealth = player1.getMaxHealth();
				monsterHealth = monsters[enemyNumber].getHealth();
				while(stillAlive && ranAway)
					{
						displayHealth(enemyNumber);
					playerTurn(enemyNumber);
					checkForAlive(enemyNumber);
						enemyTurn(enemyNumber);
						checkForAlive(enemyNumber);
					}
			}
		
		public static void displayHealth(int enemyNumber)
		{
			System.out.println("Player Health: " + playerHealth + "/" + player1.getMaxHealth());
			System.out.println("");
			System.out.println(monsters[enemyNumber].getType() + " Health: " + monsterHealth + "/" + monsters[enemyNumber].getMaxHealth());
		}
		public static void playerTurn(int enemyNumber)
		{
			
			System.out.println("What would you like to do?");
			System.out.println("  (1)Fight    (2)Heal");
			System.out.println("         (3)RUN");
			Scanner userInput = new Scanner(System.in);
			int menuChoice = userInput.nextInt();
			
			if(menuChoice == 1)
				{
					System.out.println("You go in for the ATTACK and LAND a blow!");
					Delay.delay1();
					 int damage =(int)(Math.random()*player1.getStrength())+3;
					 System.out.println("You Dealt " + damage + " to the "+monsters[enemyNumber].getType()+"!");
					 System.out.println("");
					 System.out.println("");
					 monsterHealth= monsterHealth - damage;
				}
			if(menuChoice == 2)
				{
					System.out.println("You decide to HEAL");
					Delay.delay1();
					playerHealth = playerHealth+(playerHealth/5);
					if(playerHealth>player1.getMaxHealth())
						{
							playerHealth = player1.getMaxHealth();
						}
				}
			if(menuChoice == 3)
				{
					System.out.println("You RUN AWAY from the " + monsters[enemyNumber].getType() + "...looser");
					Delay.delay1();
					ranAway = false;
				}
		}
		
		public static void enemyTurn(int enemyNumber)
		{
			if(ranAway && stillAlive)
				{
					int turnBased = (int)(Math.random()*10);
					if(turnBased >2)
						{
							int damage =(int)(Math.random()*monsters[enemyNumber].getDamage())+3;
							System.out.println("The " + monsters[enemyNumber].getType()+" goes in for the Attack!");
							Delay.delay1();
							System.out.println("You get hit for "+ damage + " damage.");
							playerHealth = playerHealth - damage;
						}
					else
						{
							Delay.delay1();
							System.out.println("The " + monsters[enemyNumber].getType()+" decides to HEAL");
							monsterHealth = monsterHealth+(monsterHealth/5);
							if(monsterHealth>monsters[enemyNumber].getMaxHealth())
								{
									monsterHealth = monsters[enemyNumber].getMaxHealth();
								}
						}

				}
			
							
		}
		
		public static void checkForAlive(int enemyNumber)
		{
			if(stillAlive && ranAway)
				{
			if(monsterHealth <= 0)
				{
					monsterDeath(enemyNumber);
				}
			if(playerHealth <= 0)
				{
				playerDeath(enemyNumber);
				}
				}
		}
			public static void monsterDeath(int enemyNumber)
				{
					System.out.println("Congratulations, you have killed the "+ monsters[enemyNumber].getType() + "!");
					player1.setXp(player1.getXp() + monsters[enemyNumber].getXpGiven());
					player1.setGold(player1.getGold() + monsters[enemyNumber].getGoldGiven());
					System.out.println("You gained " + monsters[enemyNumber].getXpGiven() + " XP!");
					System.out.println("You gained " + monsters[enemyNumber].getGoldGiven() + "g");
					if(player1.getXp()>=player1.getXpToNextLvl())
						{
							System.out.println("Congrats, you leveled up!");
							player1.setXp(player1.getXp()%player1.getXpToNextLvl());
							player1.setXpToNextLvl(player1.getXpToNextLvl()+5);
							player1.setHealth(player1.getHealth()+5);
							player1.setStrength(player1.getStrength()+5);
							player1.setDexterity(player1.getDexterity()+5);
							player1.setLevel(player1.getLevel()+1);
							
						}
					stillAlive = false;
				}
			public static void playerDeath(int enemyNumber)
				{
					System.out.println("The "+ monsters[enemyNumber].getType() + "gets you very weak so you run away");
					
					player1.setGold(player1.getGold()-5);
					
					System.out.println("You lost 5g");
				
					stillAlive = false;
				}
		
	}
