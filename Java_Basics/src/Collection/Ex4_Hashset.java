package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex4_Hashset 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet ();
		
		hs.add("sr no");
		hs.add(100);
		hs.add("rohit");
		hs.add(null);
		hs.add("A");
		hs.add(200);
		hs.add(null);
		hs.add(100);
		
		System.out.println(hs); // indexing doesn't work in hashset (data insertion is random)
		
		// hashtable means all the data store in table format depends on askey value
		
		System.out.println("------print all info using iterator cursor------");
		Iterator itr = hs.iterator();
		
		while (itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		System.out.println("------print all info using foreach loop------");

		for(Object onebyone:hs)
		{
			System.out.println(onebyone);
		}
		
		// for loop can not be used here because indexing doesn't work in hashset (data insertion is random)
		
	}

}
