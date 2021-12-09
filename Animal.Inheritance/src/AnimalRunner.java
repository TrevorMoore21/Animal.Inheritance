//import java.util.ArrayList;

public class AnimalRunner
	{

//		public static ArrayList<AnimalObjects> nine = new ArrayList<AnimalObjects>();
		
		public static Animal [] zoo = new Animal[4];
				
		public static void main(String[] args)
			{
				zoo[0] = new Cow();
				zoo[1] = new Bat();
				zoo[2] = new Penguin();
				zoo[3] = new Robin();
				
				for (Animal a: zoo)
					{
						a.bearsYoung();
						a.makesNoise();
						a.eats();
						System.out.println();
					}
				

			}

	}
