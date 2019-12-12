
public class Cheetah extends NonroaringCats
	{
		public Cheetah()
			{
				name = "Cheetah";
				catClass = "Acinonyx";
			}

		public void retractClaws()
			{
				System.out.println("The " + name
						+ " has semi-retractable claws. It needs some extra traction with all that speed.");
			}

		public void hasCatClass()
			{
				System.out.println("The " + name + " is in a different class than all other cats called the " + catClass
						+ " class.");
			}
	}
