package methods;

public class Non_static_method_from_deferent_class 
{
	public static void main(String[] args) 
	
	{
		//className objectName = new class name();
		// objectName.methodName
		
		// class name ---> work as data type
		// object name--> work as variable name
		// new       ---> is a keyword which create blank object
		// class name---> work as a constructor--->load/copy non static methods of class
		
		non_static_methods O1 = new non_static_methods();
		O1.addition();
		
		non_static_methods O2 = new non_static_methods ();
		O2.Multiplication();
		
		non_static_methods O3 = new non_static_methods ();
		O3.multipaleOper(1, 2, 3);
				
		static_methods.bike();
		
		static_methods.mobile();
	}

}
