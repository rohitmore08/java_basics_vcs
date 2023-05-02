package Array;

import java.util.Arrays;

public class Ex_8_Array_declaration_initialization_in_single_Step 

{
	public static void main(String[] args) 
	{
		String ar[]= {"rohit","vikas","xyz","abc"};
		
		System.out.println(ar.length);
		
		System.out.println(ar[3]);
		
		
		
	
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		Arrays.sort(ar);
		
		System.out.println("------print array in assending-------");
		
		
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}

}
