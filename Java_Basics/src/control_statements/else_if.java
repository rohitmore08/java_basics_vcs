package control_statements;

public class else_if 

{
	public static void main(String[] args) 
	{
		int marks = 716;
		
		if (marks>=75)
		{
			System.out.println("Distingtion");
		}
		
		else if (marks>=75)
		{
			System.out.println("first class");
		}
		
		else if (marks>=73 && marks<=76)
		{
			System.out.println("seocod class");
		} 
		
		else if (marks>=35 && marks<=44)
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
		}
	}
}
