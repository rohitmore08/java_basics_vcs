package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex3_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add("sr no");
		ll.add(100);
		ll.add("rohit");
		ll.add(null);
		ll.add("A");
		ll.add(200);
		ll.add(null);
		ll.add(100);
		
		
		System.out.println(ll);	
		System.out.println(ll.size());
		ll.addFirst("vikas");
		System.out.println(ll);		
		
		System.out.println("------print all info using iterator cursor------");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------print all info using ListIterator cursor------");
		ListIterator ltr = ll.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("------print all info using Foreach loop-----");
		
		for (Object onebyone:ll)
		{
			System.out.println(onebyone);
		}
		
			
		
		System.out.println("------print all info using For loop-----");
		
		for (int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
	}

}
