package constructor;

public class constructor_with_parameter1 
{
	
	int X;
	int Y;
								//int a & int b are local veriable
	constructor_with_parameter1(int a, int b) // constructor_with_parameter
	{
		X = a;           //X & Y are global variable
		Y = b;
	}
	
	public static void main(String[] args) 
	{
		constructor_with_parameter1 object = new constructor_with_parameter1 (100, 20); // constructor_with_parameter
		object.add();										//100 & 20 are passing to local variable which passed value to global variable
		object.mult();
		object.sub();
	}
	
	void mult ()
	{
		
		System.out.println(X*Y);
	}
	
	void add()
	{
		System.out.println(X+Y);
	}
	
	void sub()
	{
		System.out.println(X-Y);
	}
}
