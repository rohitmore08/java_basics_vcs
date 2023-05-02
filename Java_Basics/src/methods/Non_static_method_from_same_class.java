package methods;

public class Non_static_method_from_same_class 
{
	public static void main(String[] args) 
	
	{
		Non_static_method_from_same_class object = new Non_static_method_from_same_class ();
		object.x();
		
		Non_static_method_from_same_class object1 = new Non_static_method_from_same_class ();
		object1.Y();
	}
	
	void x()
	{
		System.out.println("this is an non-static method X called from same class" );
	}
	void Y()
	{
		System.out.println("this is an non-static method Y called from same class" );
	}
	
}
