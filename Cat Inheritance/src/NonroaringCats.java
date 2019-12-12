
public abstract class NonroaringCats extends Cat
	{

		@Override
		public void makeSound()
			{
				System.out.println("The " + name
						+ " does not have the ability to roar because the hyoid bone is ossified, or has stopped developing.");
			}

	}
