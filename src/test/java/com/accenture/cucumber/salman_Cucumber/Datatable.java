package com.accenture.cucumber.salman_Cucumber;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class Datatable 
{
	int i;
	@Given("^I open FB URL$")
	public void i_open_FB_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("FB page");
	}

	@Given("^fill up the New Account form with the following data$")
	public void fill_up_the_New_Account_form_with_the_following_data(DataTable dt) throws Throwable 
	{
	 List<Map<String,String>> list=dt.asMaps(String.class, String.class);
	 for(i=0;i<list.size();i++) {
		 System.out.println(list.get(i).get("First Name")+" "+ 
				 (list.get(i).get("Last Name"))+" "+(list.get(i).get("Password"))+" "+(list.get(i).get("Gender")));
		 System.out.println("\n");
	 }
	}


}
