package String_classes_methods;

public class Object_Creation 

{
	public static void main(String[] args) 
	
	{
		//Concatenation meaning
		String st="abc";
		st=st+"de";		//re-initialization
		System.out.println(st);

		// object create without 'New' keyword--> saved in Constant pool area 
		String s ="rohit";   
		System.out.println(s);
		
		
		String s1 ="rohit";  // here info of str & str1 object is same hence str1 does not create any new info 
		System.out.println(s1); // it can access the info of str object which is saved in Constant pool area
								 // that is duplication of object are not allowed
		
		
		// object create with 'New' keyword--> saved in Non Constant pool area 
		String s2 = new String ("rohit");
		System.out.println(s2);
		
		String s3 = new String ("rohit");	// here info of str2 & str3 object is same thereafter 
		System.out.println(s3);			// it can create a new new object 
											// that is duplication of object are allowed
		
		System.out.println(s==s1); //true
		System.out.println(s==s2);//false
		System.out.println(s1.equals(s3));//true
	}

}
