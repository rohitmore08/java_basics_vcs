package inheritance;

public class Hierarchical_inheritance 
{
	public static void main(String[] args) 
	{
	
		System.out.println("---Property of Son2---");
		Son2 s2 = new Son2 ();
		s2.bike2();
		s2.money2();
		System.out.println("---Property of super class in Son2---");
		s2.home();
		s2.gold1();
		s2.car1();
		
		System.out.println("---Property of Son3---");
		Son3 s3 = new Son3();
		s3.bike3();
		s3.money3();
		System.out.println("---Property of super class in Son3---");
		s3.home();
		s3.gold1();
		s3.car1();
	}

}
