
public abstract class Animal
	{
		protected String name;
	    protected String food;
		
		public abstract void bearsYoung();
			
		public void eats()
			{
				System.out.println("I am a " + name + " and I eat " + food);
				
			}
			
		public abstract void makesNoise();
			
	}
