package polymorphism;

public class Method_overriding_son extends Method_overriding_father
{
	public void money()
	{
		System.out.println("son having balance 50lac");
	}
	public void home()
	{
		super.home();// due to Super keywords we can get both methods 
		System.out.println("Son having 1BHK");
	}
	
}
