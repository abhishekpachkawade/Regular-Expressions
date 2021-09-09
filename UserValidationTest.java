package com.bl.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class UserValidationTest {

	static UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();

	
	//Happy Test Condition for First Name 
	@Test
	public void checkFirstName() {
		 String sampleName = "Abhishek";

		 UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
         boolean actual = userRegistrationProgram.checkFirstName(sampleName);

         assertEquals(true,actual);
	}
	
	//Negative Test condition
	@Test
	public void checkFirstName1() {
		 String sampleName = "abhishek";

		 UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
         boolean actual = userRegistrationProgram.checkFirstName(sampleName);

         assertEquals(true,actual);
	}
	
	//Happy Test Condition for last Name
	@Test
	 public void checkLastName(){
	        String sampleLastName = "Pachkawade";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	//Negative Test condition
	@Test
	 public void checkLastName1(){
	        String sampleLastName = "pachkawade";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	
	//Happy Test Condition for Mobile Number
	@Test
	 public void checkMobileNumber(){
	        String sampleLastName = "919919988012";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	//Negative Test condition
	@Test
	 public void checkMobileNumber1(){
	        String sampleLastName = "9199 199 880 12";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	//Happy Test Condition for Password
	@Test
	 public void checkPassword(){
	        String sampleLastName = "Cshj&9938";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	//Negative Test condition
	@Test
	 public void checkPassword1(){
	        String sampleLastName = "abhishek";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	//Happy Test Condition for Email
	@Test
	 public void checkEmailId(){
	        String sampleLastName = "abcdef@gmail.com";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	//Negative Test condition
	@Test
	 public void checkEmailId1(){
	        String sampleLastName = "abhi";

	        UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();
	        boolean actual = userRegistrationProgram.checkLastName(sampleLastName);

	        assertEquals(true,actual);
	    }
	
	
	
	
}
