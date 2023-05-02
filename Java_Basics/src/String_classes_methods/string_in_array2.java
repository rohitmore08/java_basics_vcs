package String_classes_methods;

public class string_in_array2 
{
	public static void main(String[] args) 
	
	{ 
		String S1 = "xyz_xyz1_xyz2_xyz3_xyz4";
								
									  //   0      1       2		 3       4
		String ar[] = S1.split("_"); //{"xyz", "xyz1", "xyz2", "xyz3", "xyz4"}
		
		System.out.println(ar.length);//5
		System.out.println(ar[2]);//"xyz2"
		
		System.out.println("----print array info in sequence ----");
		
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
