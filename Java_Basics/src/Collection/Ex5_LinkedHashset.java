package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;

public class Ex5_LinkedHashset 
{
	public static void main(String[] args) {
		
	LinkedHashSet lhs = new LinkedHashSet ();
	
		lhs.add("sr no");
		lhs.add(100);
		lhs.add("rohit");
		lhs.add(null);
		lhs.add("A");
		lhs.add(200);
		lhs.add(null); // only one null value accepted
		lhs.add(100); // duplicate not allowed 
	
		System.out.println(lhs); //indexing doesn't work in Linkedhashset but  order of insertion->maintained 
	
		System.out.println("------print all info using iterator cursor------");
		Iterator itr = lhs.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------print all info using foreach loop------");

		for(Object onebyone:lhs)
		{
			System.out.println(onebyone);
		}
	
	}
}