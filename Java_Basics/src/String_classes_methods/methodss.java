package String_classes_methods;

public class methodss 

{
	public static void main(String[] args) 
	{
		String s = "           karamtara";
		String s1 = "KARAMTARA";
		String s2 = "karam";
		String s3 = "";
		
		System.out.println(s.trim());// remove blank space froM left & RIGHT SIDE	OF string)
		
//		System.out.println(s.length());//9
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));//true
		System.out.println(s.contains(s2));//true
		System.out.println(s3.isEmpty());//true, blank space contains value hence it may false
		System.out.println(s.charAt(5));//t
		System.out.println(s.startsWith("kar"));//true
		System.out.println(s1.endsWith("TARA"));//true
		System.out.println(s.substring(5));//tara
		System.out.println(s.substring(1, 8)); // aramtara
		System.out.println(s.concat(s2));//karamtarakaram
		System.out.println(s.concat(" Engineering"));//karamtara Engineering
		System.out.println(s+" "+s2);//karamtara karam
		System.out.println(s.indexOf("r"));//2
		System.out.println(s.lastIndexOf("r"));//7
		System.out.println(s.replace("karamtara", "Engineering"));//Engineering
		System.out.println(s.replace("a", "b"));//kbrbmtbrb
		
		//s=s.toUpperCase();
//		System.out.println(s);//KARAMTARA
	//	System.out.println(s.startsWith("kar"));// false
	
	}
	
	
	
	

}
