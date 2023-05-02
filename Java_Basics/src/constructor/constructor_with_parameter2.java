package constructor;

public class constructor_with_parameter2 
{
	
	int X;
	int Y;
	int Z;
	int div;
	
//	constructor_with_parameter2(int a, int b) // constructor_with_parameter
//	{
//		X = a;
//		Y = b;
//	}
//	constructor_with_parameter2() // constructor_withOUT_parameter
//	{
//		X = 100;
//		Y = 200;
//		Z = 300;
//	}
	
	constructor_with_parameter2(int a, int b, int c) // constructor_with_parameter
	{
		X = a;
		Y = b;
		Z=c;
	}
	
	public static void main(String[] args) 
	{
//		constructor_with_parameter2 object = new constructor_with_parameter2 (100, 20); // constructor_with_parameter
//		
//		object.mult();
//		
//		object.add();
//		
//		object.sub();
//	
//		object.Div();
//		
//		constructor_with_parameter2 object1 = new constructor_with_parameter2 (); // constructor_withOUT_parameter
//		System.out.println(object1.X);
//		System.out.println(object1.Y);
//		System.out.println(object1.Z);
		
		constructor_with_parameter2 object2 = new constructor_with_parameter2 (100,20,0);
		object2.add();
	}
	
	
//	public void mult ()
//	{
//		System.out.println(X*Y);
//	}
	public void add()
	{
		System.out.println(X+Y);
		System.out.println(X+Y+Z);
	}
//	public void sub()
//	{
//		System.out.println(X-Y);
//	}
//	
//	public void Div()
//	{
//		div=X/Y;
//		System.out.println(div);
//	}
	
	
	
	

}
