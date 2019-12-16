
public class HouseCat extends NonroaringCats
	{
		public HouseCat()
			{
				name = "HouseCat";
				catClass = "Felis";
			}

		public void hasCatClass()
			{
				System.out.println("The " + name + " is in the cat class " + catClass + " which simply means small.");
			}
	}
