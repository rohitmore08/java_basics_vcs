package Array;
//     0   1   2   3
//   0 1   2   3   4
//   1 5   6   7   80
//   2 9   10  11  12

public class Ex_9_multi_dimensional_array 

{
	public static void main(String[] args) 
	{
		int ar[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
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
