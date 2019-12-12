
public abstract class RoaringCat extends Cat
	{

		@Override
		public void makeSound()
			{
				System.out.println("The " + name + " has the ability to roar due to a bone called the hyoid bone.");
			}

		public void hasCatClass()
			{
				System.out.println(
						"All of the big cats that have the ability to roar are in the " + catClass + " class.");
			}

	}
