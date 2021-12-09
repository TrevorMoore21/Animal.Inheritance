
public class Penguin extends Bird
	{

		public Penguin()
			{
				name = "penguin";
				food = "fish";
			}
		
		public void makesNoise()
			{
				System.out.println("Squakkk");
			}

		
		public void eats()
			{
				System.out.println("I am a " + name + " and I eat " + food);
				
			}
		
	}
