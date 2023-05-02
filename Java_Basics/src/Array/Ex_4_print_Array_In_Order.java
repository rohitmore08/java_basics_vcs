package Array;

public class Ex_4_print_Array_In_Order 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[10];
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		ar[5] = 60;
		ar[6] = 70;
		ar[7] = 80;
		ar[8] = 90;
		ar[9] = 100;
			
	for ( int i=0; i<=ar.length-1;) // in this loop condition i is refer to index values hence ar.length-1 used  
	{
		System.out.println(ar[i]);
			
		i++;
	}
	
	}

}
