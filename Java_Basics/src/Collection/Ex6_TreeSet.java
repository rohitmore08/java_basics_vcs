package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex6_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet tr = new TreeSet (); // only accept homogeneous values 
		tr.add(200);
		tr.add(100);
		tr.add(400);
		tr.add(300); 
		tr.add(500);
		tr.add(700);
		tr.add(600); 
		tr.add(100); // duplicate not allowed;
	//	tr.add(null);// does not accept any null value
		
		System.out.println(tr);
		
		tr.pollFirst(); // it drops first minimum value from the table
		System.out.println(tr); 
		
		System.out.println("------print all info using iterator cursor------");
		Iterator itr = tr.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------print all info using foreach loop------");

		for(Object onebyone:tr)
		{
			System.out.println(onebyone);
		}
		
		System.out.println("------print all info using Descending order-----");
		Iterator ditr = tr.descendingIterator();
		
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
			
			
	}

}
