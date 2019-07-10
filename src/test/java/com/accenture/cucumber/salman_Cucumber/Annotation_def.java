package com.accenture.cucumber.salman_Cucumber;

import cucumber.api.java.en.Given;

public class Annotation_def
{
	@Given("^This test case must be executed in regression phase$")
	public void this_test_case_must_be_executed_in_regression_phase() throws Throwable {
		System.out.println("this is Regression test case");
	}

	@Given("^This test case must be executed in smoke testing phase$")
	public void this_test_case_must_be_executed_in_smoke_testing_phase() throws Throwable {
		System.out.println("This is a smoke test case");
	}

	@Given("^This test case is executed in both regression and smoke testing$")
	public void this_test_case_is_executed_in_both_regression_and_smoke_testing() throws Throwable
	{

		System.out.println("Common test case for both");
	}

 
}
