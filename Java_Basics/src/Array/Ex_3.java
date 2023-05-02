package Array;

public class Ex_3 
{
	public static void main(String[] args) 
	{
		String ar [] = new String [5]; // array declaration --> Single dimensional array   
				
		// array Initialization
		ar[0] = "rohit";
		ar[1] = "ohit";
		ar[2] = "hit";
		ar[3] = "it";
		ar[4] = "t";
		
		//usage- option 1
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
//		

		// usage - option 2
		for (int i=0; i<=4; i++)
		{
			System.out.println(ar[i]);
		}
		
		//usage option 3
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println(ar.length);    // for array length

	}

}
