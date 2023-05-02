package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex2_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList (); //object of inbuilt implementetion class 
		
		
		al.add("sr no"); //0
		al.add(100);	//1
		al.add("rohit"); //2
		al.add(null);    //3
		al.add("A");     //4
		al.add(200);
		al.add(null);
		al.add(100);
		
	
		// inbuilt methods of arrayalist class
		
		
		System.out.println(al);// this method only shows the data inside the list is like a mirror
								// print ln is specially for to get result one by one in next line but here we didn't get it
		
	
		int siz = al.size();
		System.out.println(siz);
	
	//	System.out.println(al.contains(100)); //true
		
	//	System.out.println(al.containsAll(al)); // true
//		
//		System.out.println(al.get(0)); // sr
//		
//		System.out.println(al.indexOf(100));
//		
//		System.out.println(al.indexOf(null));
//		
//		System.out.println(al.isEmpty());
//		
//		System.out.println(al.lastIndexOf(null));
//		
//		System.out.println(al);
//		
//		System.out.println(al.remove(6)); // left shift operation
//		
//		System.out.println(al);
//		
//		System.out.println(al.lastIndexOf(100));
//	
		
		
//		System.out.println(al.removeAll(al));
//		
//		System.out.println(al);
//		System.out.println(al.isEmpty());
//		
//		System.out.println(al.size());
//	
//		al.add("sr no");
//		al.add(100);
//		al.add("rohit");
//		al.add(null);
//		al.add("A");
//		al.add(200);
//		al.add(null);
//		al.add(100);
//		
//		System.out.println(al);
//		al.set(2, "kiran"); // right shift operation
//		System.out.println(al);
//		
//		
//		System.out.println("------print all info using iterator cursor------");
//		
//		Iterator itr = al.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next()); // this method is actually retrieve & fetch  the data from list and shows 
//		}
//		
//		System.out.println("------print all info using ListIterator cursor------");
//		ListIterator Litr = al.listIterator();
//		while (Litr.hasNext())
//		{
//			System.out.println(Litr.next());
//		}
//		
//		System.out.println("------print all info using Foreach loop-----");
//		
//		for (Object onebyone:al)
//		{
//			System.out.println(onebyone);
//		}
//		
//		System.out.println("------print all info using For loop-----");
//		
//		for (int i=0; i<=al.size()-1; i++)
//		{
//			System.out.println(al.get(i));
//		}
	}
}
