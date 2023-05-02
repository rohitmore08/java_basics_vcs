package Interface_Implementation;

public class implement_Class implements Intrface_1,Intrface_2
{
	int d=10;

	
	public void M1(int a, int b) 
		{
		System.out.println("method M1 from interface_1 implements in implement_Class");
		int c = a+b;
		System.out.println(c);
		}

	public void M2()
 		{
		System.out.println("method M2 from interface_1 implements in implement_Class");
 		}
	
	
	
	
	public void M2(String A)
 		{
		System.out.println("method M2 from interface_2 implements in implement_Class");
		System.out.println(A);
 		}
	
	public void M3()
	 	{
		System.out.println("method M3 from interface_2 implements in implement_Class");
	 	}
	
	 public void M4()
	 	{
		System.out.println("method M4 from interface_2 implements in implement_Class");
	 	}
	 
	 public void M5()
		{
			System.out.println("method M5 from interface_2 implements in implement_Class");
		}
	 
	 
	 
	 
	 public void M6()
	 	{
		System.out.println("method M6 from implement_Class");
	 	}
	
	
}


