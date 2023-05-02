package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_LinkedList 

{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList ();
		ll.add("Rohit");
		ll.add('v');
		ll.add(55);
		ll.add(null);
		ll.add(null);
		ll.add(55.3f);
		ll.add(55);
		ll.add("Rohit");
		
		System.out.println(ll);
		
		System.out.println(ll.contains(55));
		System.out.println(ll.get(1));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.size());
		System.out.println(ll.indexOf("Rohit"));
		System.out.println(ll.lastIndexOf(55));
		
		ll.remove(1);
		System.out.println(ll);
		
		ll.add(1, 'v');
		System.out.println(ll);
		
		ll.set(2,100);
		System.out.println(ll);
		
		System.out.println("---print info by using iterator cursor---");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
		
		ll.remove(1);
		
		System.out.println("---print info by using Listiterator cursor---");
		ListIterator Litr = ll.listIterator();
		while(Litr.hasNext())
			{
				System.out.println(Litr.next());
			}
		
		ll.set(1, "kiran");
		
		System.out.println("---print info by using for loop---");
			for (int i=0; i<=ll.size()-1; i++)
		
			{
				System.out.println(ll.get(i));
			}
		
			
			System.out.println("---print info by using foreach loop---");
			ll.set(6, "more");
			for (Object fl:ll)
		
			{
				System.out.println(fl);
			}
			
			ll.clear();
			System.out.println(ll);
		
	}

}
