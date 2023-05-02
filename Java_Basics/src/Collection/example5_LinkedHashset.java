package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class example5_LinkedHashset 

{
	public static void main(String[] args) {
		
		//	1. Doesn't allow duplicate values
		//	2. Allow only 1 null value.
		//	*3. order of insertion->maintained
		//	4. no default capacity
		//	*5. DS: Hybrid  (liner+ hashtable)
		//	6. storage type: hashtable

		
	LinkedHashSet hs =new LinkedHashSet();
	hs.add("abc");
	hs.add(100);
	hs.add('A');
	hs.add(65.5f);
	hs.add(null);
	hs.add(100);
	hs.add(100);
	hs.add(null);
	
	System.out.println(hs);
	System.out.println(hs.isEmpty());  //false
	System.out.println(hs.size());  //5
	System.out.println(hs.contains('A'));  //true
	System.out.println(hs);
	hs.remove('A');
	System.out.println(hs);
		
	System.out.println("----print all info in Linkedhashset using iterator-----");
	Iterator itr = hs.iterator();
	
	while(itr.hasNext()) 
	{
		System.out.println(itr.next());
	}
	
	System.out.println("----print all info by using foreach loop----");
	for(Object s:hs) 
	{
		System.out.println(s);
	}
	
	hs.clear();
	System.out.println(hs.size());

}
}
