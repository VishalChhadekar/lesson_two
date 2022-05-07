package lession_two;

import java.io.FileNotFoundException;
import java.util.*;

class emailDirectory{
	
	public void emailSearch(String em[], String inputEmail) {
		//searching user input from email directory
				boolean flage = false;
				for(int i=0; i<em.length; i++) {
					if(inputEmail.equals(em[i])) { //equals() method compare the content, not the address. for address we use == operator.
						flage = true;
						break;
					}
					else {
						flage = false;
					}
				}
				//Status on search
				if(flage) {
					System.out.println("Email has found!");
				}
				else {
					System.out.println("Email does not found!\n Please try another one");
				}
				
	}
}

public class EmailValidation {
	public static void main(String args[]) throws FileNotFoundException {
		emailDirectory obj = new emailDirectory();
		String em [] = new String[6];
		em[0] = "chhadekarvishal@gmail.com";
		em[1] = "vishalchhadekar@gmail.com";
		em[2] = "swapnilpatil@gmail.com";
		em[3] = "sammalik@gmail.com";
		em[4] = "rohankhatrri@gmail.com";
		em[5] = "samayrasinhha@gmail.com";
		
		try (//taking user input
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter an emial to be searched in the email Directory");
			String input_Email = sc.next();
			System.out.println("User input: " + input_Email);
			
			obj.emailSearch(em, input_Email);
		}
				
	}

}
