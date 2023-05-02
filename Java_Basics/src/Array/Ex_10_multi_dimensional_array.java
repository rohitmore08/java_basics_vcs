package Array;
//     0    1   2    3
//   0 10   20  30   40
//   1 50   60  70   80
//   2 90   100 110  120

public class Ex_10_multi_dimensional_array 

{
	public static void main(String[] args) 
	{
		int ar[][]=new int[3][4];
		
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;		
		ar[0][3]=40;		
		ar[1][0]=50;
		ar[1][1]=60;
		ar[1][2]=70;
		ar[1][3]=80;
		ar[2][0]=90;		
		ar[2][1]=100;		
		ar[2][2]=110;
		ar[2][3]=120;
		
		
		for (int i=0; i<=2; i++)
		{
			for (int j=0; j<=3; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
