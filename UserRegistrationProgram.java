package com.bl.regex;

import java.util.Scanner;
import java.util.regex.*;

/*
As a User need to follow pre-defined Password rules.
Rule1 – minimum 8 Characters
Rule2 – Should have at least 1 Upper Case
Rule3 – Should have at least 1 numeric number in the password
*/

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
		
		//ask to user input
		System.out.println("Enter the Email ID ");
		String emailId = scan.next();
		
		//ask to user input
		System.out.println("Enter Mobile Number : ");
		String mobileNumber = scan.next();
		
		//ask to user input
		System.out.println("Enter Password : ");
		String password = scan.next();
		
		//passing the value in side the validateDatails
		userRegistrationProgram.validateDetails(firstName, lastName , emailId, mobileNumber,password);
	
	}
	
	
	
	public void validateDetails(String firstName,String lastName,String emailId,String mobileNumber,String password) {
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
		
		//check The condition to mobile number is valid or not
		if (userRegistrationProgram.checkMobileNumber(mobileNumber)) {
			
			System.out.println("User Mobile Number is Valid ");
					
		}else {
					
			System.out.println("User Mobile Number is not Valid");
		}
		
		//check The condition to password is valid or not
        if(userRegistrationProgram.checkPassword(password)) {
        	
            System.out.println("Valid Password");   
        }else {
        	
            System.out.println("Invalid Password");
		}
		
	}
	
	

	private boolean checkMobileNumber(String mobileNumber) {
		//regular expression for mobile number
		String regex = "(0|91)?[7-9][0-9]{9}";
		
		//compile regular expression
		Pattern pattern = Pattern.compile(regex);
		
		//if condition to check mobile Number is null or not 
		if(mobileNumber == null) {
			
			return false;
		}
		
		Matcher matcher = pattern.matcher(mobileNumber);
		
		return matcher.matches();
		
	}
	
	public boolean checkPassword(String password){
		
		//regular expression for Password
        String regex = "(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9!@#&()–{}:;',?/*~$^+=<>]{8,}$";

        //compile regular expression
        Pattern p = Pattern.compile(regex);

        //if condition to check Password is null or not 
        if (password == null) {
            return false;
        }

        Matcher m = p.matcher(password);

        return m.matches();
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
Enter the Mobile Number :
91 9919819801
Enter Password : 
Abdfdh@gv7
User first Name is Valid 
User last Name is Valid 
User last Name is Valid
User Mobile Number is Valid 
Valid Password
 */
 
