package control_statements;

public class Switch1 

{
	public static void main(String[] args) 
	{
		String X = "Rohit";
		int y = 521;
		
		switch (X)
		
		{
			case "vikas" : System.out.println("Case Fail");
			break;
			
			case "Rohit" : System.out.println("case pass");
			break;
			
			case "dfsf" : System.out.println("case Fail");
			break;
			
			case "gfhrty" : System.out.println("case Fail");
			break;
			
			case "hsre" : System.out.println("case Fail");
			break;
			
			default : System.out.println("invalid inputs");
			break;
			
		}
		
		switch (y)
		{
		case 123 : System.out.println("1st Case Fail");
		break;
		
		case 521 : System.out.println("2nd case pass");
		break;
		
		case 56 : System.out.println("3rd case Fail");
		break;
		
		case 4545 : System.out.println("4th case Fail");
		break;
		
		case 456 : System.out.println("5th case Fail");
		break;
		
		default : System.out.println("invalid inputs");
		break;
		
	}
		
	}
	 

}
