
public class Monster
	{
		private String name;
		private int level, health, damage, XPGiven;
		
		public Monster()
		{}
		
		public Monster(String t , int n, int l, int h, int x)
		{
			name = t;
			health =n;
			level = l;
			damage = h;
			XPGiven = x;
		}
	}
