package constructor;

public class sample6 {
	//global variable-->scope remains throught the class
	
	int num1, num2, num3;     // 10, 20 ,30
	String str;

	//user defined-->without/zero parameter constructor
	sample6()
	{
		num1=15;
		num2=20;	
	}
	//user defined-->string parameter constructor
	sample6(String name)   //local variable-->scope remains only within block/method
	{
		str=name;	
	}
	//user defined-->2 int parameter constructor
	sample6(int a, int b)   //10,20
	{
		num1 = a;      //10
		num2 = b;      //20
	}
	//user defined-->3 int parameter constructor
	sample6(int a, int b, int c)   
	{
		num1 = a;      //10
		num2 = b;      //20
		num3= c;     //30
	}
	public void add()
	{
		System.out.println(num1+num2+num3);
	}
	
	public void sname()
	{
		System.out.println(str);
	}
		public static void main(String[] args) 
		
		{
			sample6 oo = new sample6 ();
					oo.add();
			oo.sname();
			
		}
}
