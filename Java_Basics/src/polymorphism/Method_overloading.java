package polymorphism;

public class Method_overloading 
{
//	�addition� method declared Three times with different Argument/variable/parameter is called as method overloading
	
//	all method having same name (addition) in same class with type of argu/para
	
	void addition(int a, String b) // method addition with two different parameter
	{
		System.out.println("M1");
	}
	
	void addition(String a, int b) // method addition with two different parameter
	{
		System.out.println("M2");
	}
	
	void addition(int a, String b, String C) // method addition with three parameter
	{
		System.out.println("M3");
	}
	
	public static void main(String[] args) 
	
	{
		Method_overloading object= new Method_overloading();
		
		object.addition(3,"Method", "M"); // during compilation JVM call Method M3 by checking its arguments type & seq on first priority
		object.addition(1, "Method M2"); // during compilation JVM call Method M1 by checking its arguments type & seq on first priority
		object.addition("method M2",2); // during compilation JVM call Method M2 by checking its arguments type & seq on first priority
	}

}
