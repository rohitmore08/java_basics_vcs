package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example8_arrylist_To_Hashtable 
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
	
		
		System.out.println(al);
		
		HashSet hs = new HashSet (al);
		
		System.out.println(hs);
	
	}		

}
