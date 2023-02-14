
public class Monster
	{
		private String name;
		private int level, health, damage, XPGiven,goldGiven,maxHP;
		
		public Monster()
		{}
		
		public Monster(String t , int n, int l, int h, int x,int g,int k)
		{
			name = t;
			health =n;
			level = l;
			damage = h;
			XPGiven = x;
			goldGiven=g;
			maxHP = k;
		}
		
		
		
		public int getHealth()
			{
				return health;
			}

		public void setHealth(int health)
			{
				this.health = health;
			}
		
		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}
		
		public int getXpGiven()
			{
				return XPGiven;
			}

		public void setXp(int XPGiven)
			{
				this.XPGiven = XPGiven;
			}
		public int getGoldGiven()
			{
				return goldGiven;
			}
		public int getDamage()
			{
				return damage;
			}
		public String getType()
			{
				return name;
			}
		public int getMaxHealth()
			{
				return maxHP;
			}


	}
