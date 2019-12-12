
public abstract class Cat
	{
		protected String name;
		protected String catClass;

		public abstract void makeSound();

		public abstract void hasCatClass();

		public void retractClaws()
			{
				System.out.println("The " + name + " has the ability to retract its claws when it is not using them.");
			}

	}
