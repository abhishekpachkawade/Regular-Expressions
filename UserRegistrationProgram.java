package com.bl.regex;

import java.util.Scanner;
import java.util.regex.*;


public class UserRegistrationProgram {
	
	static UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();

	//method Check whether first name entered is valid or not it should start with cap and end with last name
	//should have minimum 3 char and also add email id   
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
	
	
	public boolean checkEmailId(String emailId) {
		//regular expression for email Id
		String regex = "^[A-Z0-9a-z+_.]+@[a-zA-Z.-]+$";
		
		//compile regular expression
		Pattern pattern = Pattern.compile(regex);
		
		//if condition to check email id is null or not 
		if(emailId == null) {
			
			return false;
		}
		
		Matcher matcher = pattern.matcher(emailId);
		
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
		
		System.out.println("Enter the Email ID ");
		String emailId = scan.next();
		
		//passing the value in side the validateDatails
		userRegistrationProgram.validateDetails(firstName, lastName , emailId);
	
	}
	
	
	
	public void validateDetails(String firstName,String lastName,String emailId) {
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
		
		//check The condition to email Id is valid or not
		if (userRegistrationProgram.checkEmailId(emailId)) {
					
			System.out.println("User Enail ID is Valid ");
					
		}else {
					
			System.out.println("User Email ID is not Valid");
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
Abc
Enter the last Name
Def
Enter the Email ID 
abcdef@gmail.com
User first Name is Valid 
User last Name is Valid 
User last Name is Valid

 */
 
