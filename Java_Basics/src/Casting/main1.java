package Casting;

public class main1 

{
	public static void main(String[] args) 
	
	{
		son s = new son();
		s.a1();
		s.a2();
		s.a3();
		s.b2();
		s.b3();
		System.out.println(" ");
		
		
		Father f = new son(); //up casting by using father class for object space allocation in jvm and store data/methods of son class 
		f.a1(); // this resulted son class method due to override  
		f.a2();
		f.a3();
		System.out.println(" ");
		
		
		son s1 = ((son)f) ; 
		
		s1.a1();
		s1.a2();
		s1.a3();
		s1.b2();
		s1.b3();
		//down casting by using father class for object space allocation in jvm and store data/methods of son class
		
	}

}
