package com.org.stepdefinition;

import com.org.objectrepository.Locators;
import com.org.resource.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends Base{
	Locators l=new Locators();
	
	
	@Given("^cus in fb login page$")
	public void cus_in_fb_login_page() {
		 launch("https://www.facebook.com/");
					
	}

	@When("^cus enters the details$")
	public void cus_enters_the_details() {
		key(l.getFname(), readvaluefromexcelsheet().get(1).get("firstname"));
		key(l.getLname(), readvaluefromexcelsheet().get(1).get("lastname"));
		key(l.getPhno(), readvaluefromexcelsheet().get(1).get("phnno"));
		key(l.getPswd(), readvaluefromexcelsheet().get(1).get("password"));
		bn(l.getSignup());
		
	
	}

	@Then("^success$")
	public void success() {
		System.out.println("successfully registered");

	}

}
