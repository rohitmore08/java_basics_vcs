package Array;

public class Ex_7_Array_declaration_initialization_in_single_Step 

{
	public static void main(String[] args) 
	{
		int ar[]= {10,20,30,40,50,60,70,80,90,100,0};
		
		System.out.println(+ar.length);
		
		System.out.println(ar[10]);
		
		System.out.println("------print array-------");
		
		for (int i=0; i<=ar.length-1; i++)
		
		{
			System.out.println(ar[i]);
		}
		
	}

}
