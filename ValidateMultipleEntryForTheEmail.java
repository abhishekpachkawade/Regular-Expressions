package com.bl.junit;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

@RunWith(Parameterized.class)
public class ValidateMultipleEntryForTheEmail {
	 
	@Test
    public void whenGivenEmailMatchingAllSamples_shouldReturnTrue(){

        boolean validationStatus = userRegistrationProgram.validateEmail(array);
        Assert.assertEquals(true,validationStatus);
    }
	
	static UserRegistrationProgram userRegistrationProgram = new UserRegistrationProgram();


	    String [] array ={"abc-100@yahoo.com","abc@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com",
	            "abc@gmail.com.com","abc+100@gmail.com"};

	    String[] array1={
	            "abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com",
	            "abc()*@gmail.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au",
	    };

	    @Test
	    public void whenGivenEmailAreNotMatchingAllSamples_shouldReturnFalse(){

	        boolean validationStatus = userRegistrationProgram.validateEmail(array1);
	        Assert.assertEquals(false,validationStatus);
	    }
	
}
