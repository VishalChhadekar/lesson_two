package lession_two;


public class StringDemo {
	public static void main(String args[]) {
		
		String st = new String("Welcome to String");
		System.out.println(st);
		System.out.println("Lenght of the string: " +st.length()); //17
		
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2, 6)); //lcom
		//this will give the substring of string from index 2 to 6
		
		//string Comparison
		String st1 = "HellYa";
		int sum=0;
		for(int i=0; i<st1.length(); i++)
		{
		  int asciiValue = st1.charAt(i);
		  sum+=asciiValue;
		  System.out.println(st1.charAt(i) + "=" + asciiValue);
		}
		System.out.println("Sum of HellYa: "+ sum);
		
		//-------------------------------------------------
		int sum1=0;
		String st2 = "Heyboy";
		for(int i=0; i<st2.length(); i++)
		{
		  int asciiValue = st2.charAt(i);
		  sum+=asciiValue;
		  System.out.println(st2.charAt(i) + "=" + asciiValue);
		}
		
		System.out.println(st1.compareTo(st2)); //-13 
		//ISCII values of different letters will be taken and then subtracted
		System.out.println("Sum of Heyboy: "+ sum);
		
		
		
		//String empty()
		String st4 = "";
		System.out.println(st1.isEmpty()); //false
		System.out.println(st4.isEmpty()); //true
		
	    //String buffer
		StringBuffer sb = new StringBuffer("This is String buffer. ");
		sb.append("Let's learn it"); 
		//as string buffer is mutable, it will append this string to first
		System.out.println(sb);
		
		//insert method
		sb.insert(0, 'w');
		System.out.println(sb);
		
		//string builder
		StringBuilder sb1=new StringBuilder("Happy ");
		sb1.append("Learning");
		System.out.println(sb1);

	}

}
