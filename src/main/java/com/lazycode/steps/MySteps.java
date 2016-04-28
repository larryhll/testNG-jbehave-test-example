package com.lazycode.steps;

import org.jbehave.core.annotations.*;

import com.prodigy.pages.Page;

public class MySteps{
	private Page page = new Page();
	
	@Then("Proper result should be displayed in results page")
	public void thenThenProperResultShouldBeDisplayedInResultsPage(){
		 System.out.println("THEN");
		 page.quitDriver();
	}
	
	@When("Enter test automation in search box")
	public void whenWhenEnterTestAutomationInSearchBox(){
		 System.out.println("WHEN");
		 page.searchKeyword();
		 
	}
	
	@Given("Open the google home page www.google.com")
	public void givenGivenOpenTheGoogleHomePageWwwgooglecom(){
		System.out.println("GIVEN");
		page.goTo();
	}
}