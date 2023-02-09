
public class Delay
	{
		
		public static void delay1()
			{
				try
					{
						Thread.sleep(250);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
		public static void delay2()
			{
				try
					{
						Thread.sleep(750);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
		public static void delay3()
			{
				try
					{
						Thread.sleep(2000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
			}
		
	}
