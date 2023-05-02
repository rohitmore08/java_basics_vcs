package control_statements;

public class nested_if 

{
	public static void main(String[] args) 
	{
		String UserName = "Rohit" ;
		String Password = "ABC";
		
		
		if (UserName == "Rohit")
		{
			System.out.println("Correct Username ------> please Enter Password");
			
			if (Password == "ABC")
			{
				System.out.println("Correct Password ------> Login Succefully ");
			}
			else
			{
				System.out.println("incorrect password ------> please try again");
			}
			
		}
		else 
		{
			System.out.println("incorrect Username ------> please try again");
		}
		
		
	}

}
