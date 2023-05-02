package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class example4_HashSet 
{
	public static void main(String[] args) 
	
	{
		
		//duplicate: not allowed
		//only one null value allowed
		//Order of insertion -random (indexing concept is not applicable here)
		//storage type- hashtable
		//no default capacity
		//DS: Hashtable
		//best choice: To remove duplicate elements when order of insertion is not mandatory.
		
		
		HashSet hs = new HashSet ();
		hs.add("rohit");
		hs.add(55.5f);
		hs.add('k');
		hs.add(100);
		hs.add(null);
		hs.add(null);
		hs.add('k');
		hs.add(100);
		
		System.out.println(hs);	 
		System.out.println(hs.contains(null));
		System.out.println(hs.isEmpty());
		hs.remove('k');
		System.out.println(hs);
		hs.add('k');
		System.out.println(hs.size()); //5 --> Duplicates are not considered
		
		
		System.out.println("--- print info by using iterator cursor---");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
				
		System.out.println("--- print info by using for each loop---");
		for(Object fe:hs)
		{
			System.out.println(fe);
		}
		
		//*** due to random insertion of Order we can not use listitrator cursor & for loop here
		
	}

}
