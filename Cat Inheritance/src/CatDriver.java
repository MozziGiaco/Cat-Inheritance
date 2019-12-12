
public class CatDriver
	{

		public static void main(String[] args)
			{
				Cat[] cats = new Cat[6];
				cats[0] = new Lion();
				cats[1] = new Tiger();
				cats[2] = new Leopard();
				cats[3] = new Jaguar();
				cats[4] = new HouseCat();
				cats[5] = new Cheetah();

				for (Cat c : cats)
					{
						c.makeSound();
						c.retractClaws();
						c.hasCatClass();

						System.out.println();
					}

			}

	}
