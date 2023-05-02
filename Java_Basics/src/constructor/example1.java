package constructor;

public class example1 
{
	
	
//	example1 ()   ---> this is an default/non parameterized constructor which is hidden in class provided by compiler
//	{
		
//	}
	
	
	
	public static void main(String[] args) 
	
	{
		example1 O1 = new example1();
		O1.M1();  
			
	}
		
	
	public void M1()
		{
		System.out.println("non static method");
		}


}
