package constructor;

public class Without_or_zero_parameter_constructor2 

{
	//Step 1 - variable declaration  (global/instance variable) 
	int a; 
	int b;
	int d;
	
	Without_or_zero_parameter_constructor2 () // constructor without parameter //user defined constructor---> provided by user
	{
		// step 2 - // variable initialization
		a = 10;   
		b = 12;
		
	}

		public static void main(String[] args) 

			{
				Without_or_zero_parameter_constructor2 object1 =new Without_or_zero_parameter_constructor2();
				object1.calc();
				
			}	
	
			// Step 3 - Usage
			public void calc()
			{
				int c = a*b;
				int d = c+b;
			
				System.out.println(c);
				System.out.println(d);
			}
		
	
}
