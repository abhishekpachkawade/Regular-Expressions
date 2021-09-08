package com.bl.regex;

import java.util.Scanner;
import java.util.regex.*;


public class UserRegistrationProgram {
	
	static UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();

	//method Check whether first name entered is valid or not it should start with cap and end with last name
	//should have minimum 3 char    
	private boolean checkFirstName(String firstName) {
		//first letter should be cap and should have min 3 letters
		String regex = "[A-Z]{1}[A-Za-z]{2}$";
		
		//Compile regular expression
		Pattern pattern = Pattern.compile(regex);
		 
		//if condition to check first name is null or not 
		if (firstName == null) {
	            return false;
	        }

	        Matcher m = pattern.matcher(firstName);
	        return m.matches();
	}
	
	
	
	public boolean checkLastName(String lastName) {
		//lastName letter should be cap and should have min 3 letters
		String regex= "^[A-Z][a-z]{2,}";
		
		//Compile regular expression
		Pattern pattern = Pattern.compile(regex);
		
		//if condition to check last name is null or not
		if(lastName == null) {
			return false;
		}
		
		Matcher matcher = pattern.matcher(lastName);
		
		return matcher.matches();
				
	}
	
	
	
	public void userInput() {
		Scanner scan = new Scanner(System.in);
		
		//ask to user input
		System.out.println("Enter the first name");
		//scanning an storing the user value
		String firstName = scan.next();
		
		//ask to user input
		System.out.println("Enter the last Name");
		//scanning an storing the user value
		String lastName = scan.next();
		
		//passing the value in side the validateDatails
		userRegistrationProgram.validateDetails(firstName, lastName);
	
	}
	
	
	
	public void validateDetails(String firstName,String lastName) {
		//check The condition to first name is valid or not
		if (userRegistrationProgram.checkFirstName(firstName)) {
			
			System.out.println("User first Name is Valid ");
			
		}else {
			
			System.out.println("User first name is not Valid");
		}
		
		
		//check The condition to last name is valid or not
		if (userRegistrationProgram.checkFirstName(lastName)) {
			
			System.out.println("User last Name is Valid ");
			
		}else {
			
			System.out.println("User last name is not Valid");
		}		
	}
	
	

	public static void main(String[] args) {
		
		//calling method userInput
		userRegistrationProgram.userInput();	

	}

}



/*
  OUTPUT 
Enter the first name
Abh
Enter the last Name
Las
User first Name is Valid 
User last Name is Valid 

 */
 
