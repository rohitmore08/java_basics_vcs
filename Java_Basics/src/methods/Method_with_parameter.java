package methods;

public class Method_with_parameter 

{
	public static void main(String[] args) 
	
	{
		substraction (50,10);
		substraction (50,41); // this is an benefit of method with parameter we can get number of declaration with same int
		
		
		Method_with_parameter O1 = new Method_with_parameter ();
		O1.division(50,5);
	
		
		non_static_methods O3 = new non_static_methods ();
		O3.multipaleOper(20, 3, 4);
		O3.multipaleOper(10, 5, 2);
	}
	
	static void substraction (int x, int y) //this is a  method with parameter
	{
		int sub = x-y;
		System.out.println("substraction is = "+ sub);
	}
	
	void division (int num1, int num2)
	{
		int div = num1/num2;
		System.out.println("Divison is = "+div );
	}

}
