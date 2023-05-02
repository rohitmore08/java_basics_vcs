package control_statements;

public class Switch 

{
	int employid;
	String employName;
	int Salary;
	String EmployCEO;
	
	void showinfo()
	{
//		System.out.println("Employ id is : "+employid +"\n"+"Employ Name is : " +employName +"\n"+"Employ Salary is : " +Salary+"\n"+"Employ CEO Name is : "+EmployCEO);
		
		System.out.println("Employ id is : "+employid);
		System.out.println("Employ Name is : " +employName );
		System.out.println("Employ Salary is : " +Salary);
		System.out.println("Employ CEO Name is : "+EmployCEO);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Vikas Details");
		
		Switch Rohit = new Switch ();
		
		Rohit.employid=714;
		Rohit.employName= "vikas";
		Rohit.Salary=50000;
		Rohit.EmployCEO="xyz";
		Rohit.showinfo();
		
		System.out.println("");
		System.out.println("Rohit Details");
		
		Switch kiran = new Switch ();
		
		kiran.employid=521;
		kiran.employName= "Rohit";
		kiran.Salary=4500;
		kiran.EmployCEO="abc";
		kiran.showinfo();
				
		
	}
	

}
