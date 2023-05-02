package polymorphism;

public class Method_overriding 
{
public static void main(String[] args) 
	
	{
		Method_overriding_father  f=new Method_overriding_father ();
		
		f.money();  // method money override (in father as well as class son)  
		f.home(); // method Home override (in father as well as class son)  
		
		
		Method_overriding_son  s=new Method_overriding_son();
		s.money();  
		s.home(); 
	}

}
