package inheritance;

public class SingleLevel_inheritance 
{
	public static void main(String[] args) 
	{
			System.out.println("----Father's Property----");
			Father O1 = new Father();
			O1.home();
			O1.gold();
			O1.car();
			
			
			System.out.println("----Son Property----");
			Son o2 = new Son ();
			o2.bike();
			o2.money();
			
			o2.home(); // --> single level inheritance
			o2.car();
			o2.gold();
	}

}
