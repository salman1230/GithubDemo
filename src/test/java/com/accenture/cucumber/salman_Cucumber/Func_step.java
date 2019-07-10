package com.accenture.cucumber.salman_Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Func_step 
{

@Given("^Browser must be present in the system$")
public void browser_must_be_present_in_the_system() throws Throwable
{
	System.out.println("Chrome is Installed");
}

@When("^user opens the apps in the browser$")
public void user_opens_the_apps_in_the_browser() throws Throwable {
System.out.println("Open the Testme URL in Chrome");
}

@Then("^Testme opens in the browser$")
public void testme_opens_in_the_browser() throws Throwable
{
	System.out.println("User in Testme page");
}

@Given("^User must be Already registeed$")
public void user_must_be_Already_registeed() throws Throwable
{
	System.out.println("Name is already Exist");
}

@When("^user enter the valid credential$")
public void user_enter_the_valid_credential() throws Throwable
{
	System.out.println("Enter the valid user name");
}

@Then("^User must be in the Home Page$")
public void user_must_be_in_the_Home_Page() throws Throwable
{
	System.out.println("Logged In Succuessfully");
}

@Given("^User must have the search option$")
public void user_must_have_the_search_option() throws Throwable
{
	System.out.println("Enter the product in search option");
}

@When("^search for the product with the name$")
public void search_for_the_product_with_the_name() throws Throwable
{
	System.out.println("HeadPhone");
}

@Then("^searched product detail must be displayed in page$")
public void searched_product_detail_must_be_displayed_in_page() throws Throwable
{
	System.out.println("Product Detail is displayed");
}


}
