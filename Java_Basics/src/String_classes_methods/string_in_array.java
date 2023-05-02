package String_classes_methods;

public class string_in_array 
{
	public static void main(String[] args) 
	
	{ 
		String S1 = "abc abc1 abc2 abc3 abc4";
		System.out.println(S1);
		
		String ar[] = S1.split(" "); //{"abc", "abc1", "abc2", "abc3", "abc4"}
		
		System.out.println(ar.length);//5
		System.out.println(ar[2]);//"abc2"
		
		System.out.println("----print array info in sequence ----");
		
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
