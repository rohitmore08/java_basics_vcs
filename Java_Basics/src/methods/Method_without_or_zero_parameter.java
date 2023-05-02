package methods;

public class Method_without_or_zero_parameter 

{
	public static void main(String[] args) 
	{
		Method_without_or_zero_parameter O = new Method_without_or_zero_parameter(); // object created for non static method "addition" 
				O.addition();
	}
	
	void addition() // this is an method without/zero parameter
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
