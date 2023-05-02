package methods;

public class Static_method_from_same_class 

{
	public static void main(String[] args) 
	
	{
		M1(); // static - regular method called from same class...syntax--> // methodName(); 
		M2(); // static - regular method called from same class
		
	}
	
	static void M1() // static - regular method 
	{
		System.out.println("method M1 is from same class");
	
	}
	
	static void M2() // static - regular method
	{
		
		System.out.println("method M2 is from same class");
	}
	
	

}
