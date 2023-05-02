package methods;

public class Method_with_parameter1 
{
	public static void main(String[] args) 
	
	{
		
		int std;
		char cls;
		String name;
		int RollNu;
		
		StudentInfo (8, 'A', "Rohit More", 58, 85.5f, "First class");
		System.out.println("");
		StudentInfo (8, 'A', "Vikas More", 60, 95.5f, "distingtaion");
		
	}

	static void StudentInfo(int Standerd, char Class, String Name, int RollNo, float Per, String Remark)
	{
		System.out.println("Standerd :- "+Standerd+"Th");
		System.out.println("Student Class :- " + Class);
		System.out.println("Student Name :- " + Name);
		System.out.println("Student Roll No :- " + RollNo);
		System.out.println("Student Percentage :- " + Per+"%");
		System.out.println("Remark :- " + Remark);
		
	}
	
}