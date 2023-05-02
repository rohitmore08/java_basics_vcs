package constructor;

public class constructor_with_parameter3 
{
	
	String password;
	String username;
	
	constructor_with_parameter3(String pass, String User) // constructor 01 _with_parameter
	{
		password = pass;
		username = User; 
	}
	
	constructor_with_parameter3() // constructor 02 _without_parameter----> we can crate number of constructor but with an different parameters and different objects only. 
	{
		password = "vikas"; 	//constructor overloading 
		username = "more";		//constructor overloading 
	}
	
	public static void main(String[] args) 
	
	{
		constructor_with_parameter3 object = new constructor_with_parameter3 ("Rohit", "kiran"); // constructor_with_parameter
		
		System.out.println("password is " + object.password);
		System.out.println("username is " + object.username);
	
		constructor_with_parameter3 object1 = new constructor_with_parameter3 (); 
		
		System.out.println("password is " + object1.password);
		System.out.println("username is " + object1.username);
	
	
	}
	
	

}
