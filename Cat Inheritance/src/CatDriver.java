
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
				
				HouseCat h = new HouseCat();
				
				h.makeSound();
				h.retractClaws();
				h.hasCatClass();
				
				Cheetah c = new Cheetah();
				
				c.makeSound();
				c.retractClaws();
				c.hasCatClass();
				
				Tiger t = new Tiger();
				
				t.makeSound();
				t.retractClaws();
				t.hasCatClass();
				
				Lion l = new Lion();
				
				l.makeSound();
				l.retractClaws();
				l.hasCatClass();

				Jaguar j = new Jaguar();
				
				j.makeSound();
				j.retractClaws();
				j.hasCatClass();
				
				Leopard le = new Leopard();
				
				le.makeSound();
				le.retractClaws();
				le.hasCatClass();
				
				
			}

	}
