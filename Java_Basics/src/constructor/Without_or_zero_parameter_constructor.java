package constructor;

public class Without_or_zero_parameter_constructor

{
	//Step 1 - variable declaration  (global/instance variable) 
	String Username; 
	String password;
	
	Without_or_zero_parameter_constructor () // constructor without parameter //user defined constructor---> provided by user
	
	{
		// step 2 - // variable initialization
		   
		password = "kiran";
		
	}
		
	public static void main(String[] args) 
	{
			Without_or_zero_parameter_constructor object1 =new Without_or_zero_parameter_constructor();
			object1.loginpage();
			
			System.out.println("password is = "+object1.password);
	}
	
	// Step 3 - Usage
	public void loginpage()
	{
		Username= "rohit";
		System.out.println("enterd user name is = " + Username);
			
		//System.out.println("enterd Password is = " + password);
			
	}
	
}
