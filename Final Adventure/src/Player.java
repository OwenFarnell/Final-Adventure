
public class Player
	{
		
			private String name;
			private int level,health,strength,dexterity,xpToNextLvl;
			
			public Player()
			{}
			
			public Player(String t , int n, int o, int c, int l,int h)
			{
				name = t;
				health =n;
				strength = o;
				dexterity = c;
				level = l;
				xpToNextLvl = h;
			}
	}
