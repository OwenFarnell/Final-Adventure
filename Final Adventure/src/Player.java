
public class Player
	{
		
			private String name;
			private int level,health,strength,dexterity,xpToNextLvl,xp;
			
			public Player()
			{}
			
			public Player(String t , int n, int o, int c, int l,int h,int p)
			{
				name = t;
				health =n;
				strength = o;
				dexterity = c;
				level = l;
				xpToNextLvl = h;
				xp = p;
			}
			
			public int getHealth()
				{
					return health;
				}

			public void setHealth(int health)
				{
					this.health = health;
				}
			public int getStrength()
				{
					return strength;
				}

			public void setStrength(int strength)
				{
					this.strength = strength;
				}
			public int getDexterity()
				{
					return dexterity;
				}

			public void setDexterity(int dexterity)
				{
					this.dexterity = dexterity;
				}
			public int getLevel()
				{
					return level;
				}

			public void setLevel(int level)
				{
					this.level = level;
				}
			public int getXpToNextLvl()
				{
					return xpToNextLvl;
				}

			public void setXpToNextLvl(int xpToNextLvl)
				{
					this.xpToNextLvl = xpToNextLvl;
				}
			public int getXp()
				{
					return xp;
				}

			public void setXp(int xp)
				{
					this.xp = xp;
				}
			
	}
