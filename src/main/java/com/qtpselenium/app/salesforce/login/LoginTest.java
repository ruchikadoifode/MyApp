package com.qtpselenium.app.salesforce.login;

import cucumber.api.java.en.Given;

public class LoginTest {
	
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_Go_To_Salesforce(String URL,String browser){
		System.out.println("I am going to "+ URL +" on  "+ browser);
		//selenium.openBrowser(browser);
		//selenium.navigate(URL);
	}
		
	}


