package Abstract_Concrete;

abstract public class Sample2 // abstract class

{
	// complete methods
		
		void m1()// method declaration 
		{
			System.out.println("complete method m1 from abstract class");
		}
		
	// incomplete method
		abstract public void m2(); // method declaration 
		{
			System.out.println("incomplete method m2 from abstract class"); // this declaration statement will execute as printing statement only..no connection with abstract method m2
		}

	// incomplete method
		abstract public void m3();// method declaration
		{

		}
		{
			System.out.println("incomplete ");// this is a printing statement only
		}
		
}
