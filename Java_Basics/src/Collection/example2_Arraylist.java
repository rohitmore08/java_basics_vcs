package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example2_Arraylist

{
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList(); //al object is having by default 10 value capacity which is resizable
		al.add("Rohit");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add("abc");
		al.add(null);
		al.add(null);
		al.add("Rohit");

		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al.contains(100));
		System.out.println(al.get(3));
		System.out.println(al.indexOf(null));
		System.out.println(al.lastIndexOf(null));
		
		System.out.println(al);
		
		al.add(4, "vikas"); //insert info in between arraylist--> right shift operation
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);//remove/delete info in between arraylist--> left shift operation
		
		al.set(4, "abc");
		System.out.println(al); //modify/update info
		
			System.out.println("--- Print information by using iteretor cursor---");
			Iterator itr = al.iterator();
			while(itr.hasNext())
				{	
					System.out.println(itr.next());
				}
		
			System.out.println("--- Print information by using listiteretor cursor---");
			ListIterator litr = al.listIterator();
			while(litr.hasNext())
				{	
				System.out.println(litr.next());
				}
		
			System.out.println("------print all info using for loop------");
			for(int i=0; i<=al.size()-1; i++)
				{
					System.out.println(al.get(i));
				}
			
			System.out.println("------print all info using for each loop------");
			for(Object s1:al)
				{
					System.out.println(s1);
				}
			
			System.out.println(al.size());
			al.clear();
			
			System.out.println(al.size());
			
			System.out.println(al);
	
	}


}
