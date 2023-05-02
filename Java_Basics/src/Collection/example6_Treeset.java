package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class example6_Treeset 

{
	public static void main(String[] args) 
	{
		//	1. doesn't allow duplicate 
		//	*2. null values: not allowed
		//	*3. order of insertion- Ascending order.
		//	4. no default capacity.
		//	5. DS: Balanced tree
		//	6. storage type: hashtable		
		//	***Note: we can store only homogeneous data***
		//	best choice: To remove duplicate elements when order of insertion is Asscending order.

		TreeSet tr = new TreeSet();
		
//		tr.add("rohit");
//		tr.add(55.5f);
//		tr.add('k');
//		tr.add(100);
//		tr.add(null);
//		tr.add(null);
//		tr.add('k');
//		tr.add(100);
		
		//we can store only homogeneous data,doesn't allow duplicate 
		
		tr.add(100);
		tr.add(100);
		tr.add(30);
		tr.add(60);
		tr.add(80);
		tr.add(90);
		tr.add(10);
		tr.add(30);
		tr.add(20);
		tr.add(70);
		tr.add(40);
		tr.add(40);
		tr.add(50);
		tr.add(45);
		//tr.add(null); doesent allow null 
		
		System.out.println(tr);
		
		System.out.println(tr.isEmpty());
		System.out.println(tr.size());
		System.out.println(tr.contains(100));
		System.out.println(tr.first());
		System.out.println(tr.last());

		tr.remove(45);
		System.out.println(tr);
		
		System.out.println("---print info by using iterator cursor---");
		Iterator itr = tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		
		System.out.println("---print info by using disending order cursor---");
		Iterator di = tr.descendingIterator();
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
		
		
		System.out.println("--- print info by using for each loop---");
		for(Object fe:tr)
		{
			System.out.println(fe);
		}
		
		// for loop will not work properly due to absence of indexing value
		System.out.println("--- print info by using for loop---");
		for(int i=0; i<=tr.size()-1; i++)
		{
			System.out.println(i);
		}
	}

}
