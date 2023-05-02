package Generalization;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		JioNetwork jio = new JioNetwork ();
		jio.Charges();
		jio.SMS();
		jio.Internet();
		jio.Call();
		jio.ExtraFeature();
		System.out.println(" ");
		
		
		AirtelNetwork2 Airtel = new AirtelNetwork2 ();
		Airtel.Charges();
		Airtel.SMS();
		Airtel.Internet();
		Airtel.Call();
		Airtel.ExtraFeature();
		System.out.println(" ");
		
		IdeaNetwork3 Idea = new IdeaNetwork3 ();
		Idea.Charges();
		Idea.SMS();
		Idea.Internet();
		Idea.Call();
		Idea.ExtraFeature();
	}

}
