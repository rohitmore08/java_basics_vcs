package this_super_kayword;

public class This_Keywords 
{
	int i=10; // global
	
	void demo()
	{
		int i=20; //local
		
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public static void main(String[] args) 
	{
		This_Keywords thiskey=new This_Keywords();
		thiskey.demo();
	}

}
