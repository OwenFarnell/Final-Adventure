
public class Monster
	{
		private String name;
		private int level, health, damage, XPGiven,goldGiven;
		
		public Monster()
		{}
		
		public Monster(String t , int n, int l, int h, int x,int g)
		{
			name = t;
			health =n;
			level = l;
			damage = h;
			XPGiven = x;
			goldGiven=g;
		}
	}
