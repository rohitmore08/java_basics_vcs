package Exception_Handling;

public class Example4_try_catche 
{
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int c = 0 ;

		try
		{
			c = a / b; // 10/0 risky code
		}	
		catch (NullPointerException e) 
		{
			System.out.println("NullPointerException handled");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException handled");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("generic exception handled");
		}
	

		System.out.println(c);
		System.out.println("Hi...");

	}


}
