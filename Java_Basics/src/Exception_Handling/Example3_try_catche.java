package Exception_Handling;

public class Example3_try_catche 
{
	public static void main(String[] args) 
	{
		int a []=new int[5];
	//		a[4]=100;
	//	System.out.println(a[4]);-->100
		
		try
		{
			//risky code
			a[5]=100;// java.lang.ArrayIndexOutOfBoundsException (declared array only up to 4th index value)
			System.out.println(a[5]);
		}
		catch (Exception e)
		{
			System.out.println("ArrayIndexOutOfBoundsException (we have declare array only up to 4 index value)");
		}
		System.out.println("i am out of excpetion method");
	}

}
