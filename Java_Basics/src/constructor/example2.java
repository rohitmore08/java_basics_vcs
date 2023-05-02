package constructor;

public class example2 

{
	
	example2() // User defined Constructor
	{
		// System.out.println("hii"); 
	}
	
	public static void main(String[] args) 
	
	{
		example2 O2 = new example2();
		O2.M2();
	}
	
	
		public void M2 ()
		{
			System.out.println("non static method M2");
		}

}
