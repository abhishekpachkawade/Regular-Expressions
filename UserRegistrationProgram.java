package com.bl.junit;

import java.util.ArrayList;
import java.util.List;
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
	

	 public boolean validateEmail(String[] array){


	        boolean result=false;
	        List<String> list = new ArrayList<>();
	        for(int i=0;i<array.length;i++){
	            String emailRegex= "^([a-zA-Z0-9+_.-]+)@([a-zA-Z0-9.-]+){8,15}$";
	            Pattern pattern = Pattern.compile(emailRegex);
	            Matcher matcher = pattern.matcher(array[i]);
	            result= matcher.matches();
	        }
	        return result;
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
