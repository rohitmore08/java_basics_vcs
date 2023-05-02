package Exception_Handling;

public class Example_try_catche 
{
public static void main(String[] args) 
{
	int a=10;
	int b =0; //b=2
	int c;
			
	try //risky code/statement must be in try method
	{
		
		c = a/b; 					// (we can not divide by 0 to any number) //java.lang.ArithmeticException 
		System.out.println(c);
		System.out.println("hhh"); 	//this will not execute because risky code used in try method
	}
	catch (Exception e)
	{
		System.out.println("ArithmeticException observed because we can not divide by 0 to any number)");
		
	}
	
		System.out.println("hiii");
}
}
