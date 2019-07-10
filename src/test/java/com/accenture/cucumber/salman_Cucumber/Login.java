package com.accenture.cucumber.salman_Cucumber;

import cucumber.api.java.en.When;

public class Login
{
	@When("^Login using user(\\d+) and pass(\\d+)$")
	public void login_using_user_and_pass(String arg1, String arg2) throws Throwable
	{
    System.out.println("Users have logged in using below credentials");
    System.out.println(arg1+" "+arg2);
	}

}
