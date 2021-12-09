
public class Cow extends Mammal
	{

		public Cow()
			{
				name = "cow";
				food = "grass";
			}
		
		public void makesNoise()
		{
			System.out.println("Moooooooo");
		}

		
		public void eats()
			{
				System.out.println("I am a " + name + " and I eat " + food);
				
			}
		
	}
