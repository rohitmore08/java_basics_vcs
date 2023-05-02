package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class example7_generic // by providing data type in array list it can be made homogeneous/generic class 

{
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
		
		ar.add("abc");
		ar.add("def");
		ar.add("xyz");
		ar.add("abc1");
		ar.add(100);
		
		System.out.println(ar);
						
			Iterator<String> itr = ar.iterator();
			while (itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}
		
}
