package com.bl.regex;

import java.util.Scanner;
import java.util.regex.*;


public class UserRegistrationProgram {

	//method Check whether first name entered is valid or not it should start with cap and
	//should have minimum 3 char    
	private boolean checkFirstName(String firstName) {
		//first letter should be cap and should have min 3 letters
		String regex = "^[A-Z]{1}[A-Za-z]{2}";
		
		//Compile regular expression
		Pattern pattern = Pattern.compile(regex);
		 
		//if condition to check first name is null or not 
		if (firstName == null) {
	            return false;
	        }

	        Matcher m = pattern.matcher(firstName);
	        return m.matches();
	}
	

	public static void main(String[] args) {
		//creating object of UserRegistrationProgram class
		UserRegistrationProgram user = new UserRegistrationProgram();
		
		//ask to user value
		System.out.println("Enter the User Name");
		Scanner scan = new Scanner(System.in); 
		//scanning and storing the value in firstName
		String firstName = scan.next();
		
		//check The condition to First name is valid or not 
		if(user.checkFirstName(firstName)) {
			System.out.println("User Name is Valid ");
		}else {
			System.out.println("User name is not Valid");
		}

	}
	
}


/*
OUTPUT
Enter the User Name
Abh
User Name is Valid 

*/


