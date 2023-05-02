package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example1_Vector 

{
	public static void main(String[] args) 
	
	{
		Vector v = new Vector();
		
		v.add ("Rohit");
		v.add(714);
		v.add(85.5f);
		v.add("abc");
		v.add(null);
		v.add(null);
		v.add('A');
		v.add('B');
		v.add(null);
		v.add('A');
		
		
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.get(2));
		System.out.println(v.contains(1));
		System.out.println(v.contains(714));
		System.out.println(v.firstElement());
		System.out.println(v.indexOf('A'));
		System.out.println(v.lastIndexOf('A'));
		v.set(1, 100);
		System.out.println(v);
		v.add(1, 714);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		
		System.out.println("--- --- Print information by using iteretor cursor---");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("--- --- Print information by using listiteretor cursor---");
		ListIterator Litr = v.listIterator();
		while(Litr.hasNext())
		{
			System.out.println(Litr.next());
		}
		
		
		System.out.println("--- --- Print information by using for loop---");
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("--- --- Print information by using foreach loop---");
		for(Object v1:v)
		{
			System.out.println(v1);
		}
		
		System.out.println("------print vector info using enumeration cursor------");
		
		Enumeration enu = v.elements();
		while (enu.hasMoreElements())		
			{
				System.out.println(enu.nextElement());
			}
		
		v.clear();
		System.out.println(v);
		
		System.out.println(v.size());
	}

}
