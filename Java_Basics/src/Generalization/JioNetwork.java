package Generalization;

 class JioNetwork implements Simcard

{
	 {
	 System.out.println("------JioNetwork pack details------");
	 }
	public void Charges()
	{
		System.out.println("Rs 500 : 84 day");
	}
	public void SMS()
	{
		System.out.println("SMS : 100 per day");
	}
	
	public void Internet()
	{
		System.out.println("Internet : 1GB per day");
	}
	public void Call()
	{
		System.out.println("Calling : free");
	}
	public void ExtraFeature()
	{
		System.out.println("videoCalling : free");
	}

}

