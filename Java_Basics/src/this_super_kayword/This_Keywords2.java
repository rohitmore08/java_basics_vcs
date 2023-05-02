package this_super_kayword;

public class This_Keywords2 extends This_Keywords1 
{
	int a=20; // global from same class
	
	void demo2(int a)
	{
//		int a=30; //local from same class
		
		
		System.out.println(super.a);  //----> global variable from different class //10
		System.out.println(this.a);  //----> global variable from same class //20
		System.out.println(a);      //----> local variable from same class //30
		
	
	}
	
	public static void main(String[] args) 
	{
		This_Keywords2 thiskey=new This_Keywords2();
		thiskey.demo2(30);
		
	}

}
