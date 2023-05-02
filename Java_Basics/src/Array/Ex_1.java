package Array;

public class Ex_1 
{
	public static void main(String[] args) 
	{
		int a [] = new int [5]; // array declaration --> Single dimensional array   
				
		// array Initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//usage- option 1
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		

		// usage - option 2
		for (int i=0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		
		//usage option 3
		for (int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(a.length);    // for array length

	}

}
