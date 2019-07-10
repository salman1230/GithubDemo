package com.accenture.cucumber.salman_Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef 
{
	String s;
	@Given("^user wants to print Hello$")
	public void predef() throws Throwable
	{
	s="Hello World";	
	}

	@Then("^Hello World Display in console$")
	public void postdef() throws Throwable
	{
		System.out.println(s);
	}

 
}
