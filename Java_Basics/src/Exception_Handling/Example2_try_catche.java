package Exception_Handling;

public class Example2_try_catche 
{
	public static void main(String[] args) 
	{
		int a []=new int[5];
	
		
		try
		{
			a[6]=100;					// java.lang.ArrayIndexOutOfBoundsException (declared array only up to 4th index value)
			System.out.println(a[5]);
		}
		catch (Throwable e)
		{
			System.out.println("ArrayIndexOutOfBoundsException (we have declare array only up to 4 index value)");
			//e.printStackTrace();			 // used  to get exception name 
		}
		
		System.out.println("i am out of excpetion method");
	}

}
