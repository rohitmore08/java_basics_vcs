package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex1_Vector  {
	public static void main(String[] args) 
	{
		Vector v = new Vector (); //object of inbuilt implementation class vector 
//		Vector v = new Vector (15);  //it can be double
//		Vector v = new Vector (11);  //it can be double

		
		v.add("abc");
		v.add('V');
		v.add(100);
		v.add("rohit");
		v.add(null);
		v.add("A");
		v.add(200);
		v.add(null);
		v.add(100);
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.firstElement());
		
		v.add(300);
		v.add('m');
		
		System.out.println(v.capacity());
		System.out.println(v);
		
		System.out.println(v.set(7,"vikas"));
		System.out.println(v);
		
		System.out.println(v.remove(10)); 
		System.out.println(v);
		
		
		System.out.println("------print all info using Enamunaration cursor-------");
		
		Enumeration enu = v.elements(); // मोजणी
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		System.out.println("------print all info using iterator cursor------");
		Iterator itr = v.iterator(); //पुनरावृत्ती करणारा
		
			while (itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
		System.out.println("------print all info using ListIterator cursor------");
		ListIterator litr = v.listIterator();
		
			while (litr.hasNext())
			{
				System.out.println(litr.next());
			}
			
		System.out.println("------print all info using for loop------");
					
			for (int i=0; i<=v.size()-1; i++)
			{	
				System.out.println(v.get(i));
			}
		
			System.out.println("------print all info using foreach loop------");
			
			for (Object eachv:v)
			{	
				System.out.println(eachv);
			}
	}

}
