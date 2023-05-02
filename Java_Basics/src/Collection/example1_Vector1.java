package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example1_Vector1 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector ();
		v.add("ICMR");
		v.add(500);
		v.add(85.8f);
		v.add(null);
		v.add(null);
		v.add('k');
		v.add('v');
		v.add('k');
		
		System.out.println(v);
		
		System.out.println("--- print element by using Enumeration cursor---");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("--- print element by using itretor cursor---");
		Iterator itr = v.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--- print element by using ListItretor cursor---");
		 ListIterator litr = v.listIterator();
		while (litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("--- print element by using for loop---");
		for (int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("--- print element by using foreach loop---");
		for (Object v1:v)
		{
			System.out.println(v1);
		}
		
	}

}
