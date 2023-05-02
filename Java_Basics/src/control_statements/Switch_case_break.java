package control_statements;

public class Switch_case_break 
{
	public static void main(String[] args) 
	{
		
		String b = "cd";
		
		switch(b)
		{
			case "gb":
				System.out.println("today is monday");
			break;
			
			case "ab":
				System.out.println("today is tuesday");
			break;

			case "dc":
				System.out.println("today is Wen");
			break;
			
			default:
				System.out.println("somthing wrong");
			break;
		}
	}
}
