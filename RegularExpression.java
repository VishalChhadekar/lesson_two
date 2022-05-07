package lession_two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String args[]) {
		String st1 = new String("This is it");
		String st2 = new String("That's all");
		String st3 = new String("This is it");
		
		//calling internal method: for pattern matching
		System.out.println(Pattern.matches(st1, st2));//false
		System.out.println(Pattern.matches(st1, st3));//true-cause same
		System.out.println(Pattern.matches(st2, st3));//false
			
		//pattern class
		System.out.println("\nDemo for Pattern class\n");
		Pattern pattern = Pattern.compile("This is it"); //custom pattern, to be searched
		
		Matcher m = pattern.matcher("This is it for all you need"); //pattern, from which above pattern have to search
		
		System.out.println(m.find()); //finding String using find() method
		while (m.find()) {
	    	 
	           
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
    }

		System.out.println(m.find()); // false
		
	     
	}

	}


