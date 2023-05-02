package Array;

import java.util.Arrays;

public class Ex_6_print_Array_In_sorting_Order 
{
	public static void main(String[] args) 
	{
		int ar[]= new int[10];
		ar[0] = 90;
		ar[1] = 30;
		ar[2] = 50;
		ar[3] = 20;
		ar[4] = 80;
		ar[5] = 60;
		ar[6] = 10;
		ar[7] = 70;
		ar[8] = 100;
		ar[9] = 40;
		//i=0, 0
		
		System.out.println("------print original info-------");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);// this is method from array class which used to sort values in order
		
		System.out.println("------print info in asscending order-------");
		
		
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		System.out.println("------print info in desscending order-------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}

}
