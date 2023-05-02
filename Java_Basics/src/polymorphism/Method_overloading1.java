package polymorphism;

public class Method_overloading1 
{
//	�addition� method declared Three times with different Argument/variable/parameter is called as method overloading
	
//	all method having same name (addition) in same class with Diff no of Argument
	
	void addition(int a, int b) // method M1 with two argument/parameter
	{
		System.out.println(a+b);
	}
	
	void addition(int a, int b, int c) // method M2 with three argument/parameter
	{
		System.out.println(a+b+c);
	}
	
	void addition(int a) // Method m3 with one argument/parameter
	{
		System.out.println(a);
	}
	
	void addition(String a )
	{
		System.out.println("method with same name but diff parameter");
		System.out.println(a);
	}
	
	void addition()
	{
		System.out.println("method with same name but without parameter");
	}
	
	public static void main(String[] args) 
	
	{
		Method_overloading1 object= new Method_overloading1();
		object.addition();
		object.addition("rohit"); // during compilation JVM call Method M3 by checking its arguments on first priority
		object.addition(1); // during compilation JVM call Method M3 by checking its arguments on first priority
		object.addition(20, 2); // during compilation JVM call Method M1 by checking its arguments on first priority
		object.addition(10, 20, 30); // during compilation JVM call Method M2 by checking its arguments on first priorit
	}

}
