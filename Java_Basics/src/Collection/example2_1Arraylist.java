package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example2_1Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList ar = new ArrayList();
			ar.add("KEPl");
			ar.add(1000);
			ar.add('A');
			ar.add("abc");
			ar.add(33.5f);
			
			System.out.println(ar);
			
			System.out.println("---print element by using Iterator cursor---");
			Iterator iar = ar.iterator();
			
			while (iar.hasNext())
			{
				System.out.println(iar.next());
			}
			
			
			System.out.println("---print element by using ListIterator cursor---");
			ListIterator Lar = ar.listIterator();
			while (Lar.hasNext())
			{
				System.out.println(Lar.next());
			}
			
			System.out.println("---print element by using for loop---");
			for (int i=0; i<=ar.size()-1; i++)
			{
				System.out.println(ar.get(i));
			}
			
			ar.set(1,2000);
			
			System.out.println("---print element by using foreach loop---");
			for(Object fre:ar)// for each loop--use when you have lot of data in single object
			{
				System.out.println(fre);
			}
			
		
	}

}
