package com.bl.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProgram {
	
	boolean checkFirstName(String firstName) {
		//first letter should be cap and should have min 3 letters
		String regex = "[A-Z]{1}[A-Za-z]{2,}$";
		
		//Compile regular expression
		Pattern pattern = Pattern.compile(regex);
		 
		//if condition to check first name is null or not 
		if (firstName == null) {
	            return false;
	        }

	        Matcher m = pattern.matcher(firstName);
	        return m.matches();
	}
	
	boolean checkLastName(String lastName) {
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
	
	
	 boolean checkEmailId(String emailId) {
		//regular expression for email Id
		String regex = "^[a-zA-Z0-9+_.]+@[a-zA-Z.-]+$";
		
		//compile regular expression
		Pattern pattern = Pattern.compile(regex);
		
		//if condition to check email id is null or not 
		if(emailId == null) {
			
			return false;
		}
		
		Matcher matcher = pattern.matcher(emailId);
		
		return matcher.matches();
	}
	
	 
	 boolean checkMobileNumber(String mobileNumber) {
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
		
		boolean checkPassword(String password){
			
			//regular expression for Password
	        String regex = "^(?=.*[0-9])\" + \"(?=.*[a-z])(?=.*[A-Z])\" + \"(?=.*[@#$%^&+=])\" + \"(?=\\\\S+$).{8,}$";

	        //compile regular expression
	        Pattern p = Pattern.compile(regex);

	        //if condition to check Password is null or not 
	        if (password == null) {
	            return false;
	        }

	        Matcher m = p.matcher(password);

	        return m.matches();
	    }


	
}
