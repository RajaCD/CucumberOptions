//package uk.co.ordnancesurvey.ofip.orderfultilment;

import cucumber.api.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValetParking_Steps {
	
	@SuppressWarnings("unused")
	@Given("^I want to park my car in valet parking lot$")
	public void i_want_to_park_my_car_in_valet_parking_lot() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(true)
		{
			System.out.println("Given Condition - Raja added glue ");
		}
		else
		{
	    throw new PendingException();
		}
	}
		
	@SuppressWarnings("unused")
	@When("^I park my car in the Valet Parking Lot for (\\d+) mins$")
	public void i_park_my_car_in_the_Valet_Parking_Lot_for_mins(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(true)
		{
			System.out.println("I park my car in the Valet Parking for 10mins - Raja Added Glue");
		}
		else
		{
	    throw new PendingException();
		}
	}

	@SuppressWarnings("unused")
	@Then("^I will have to pay \\$(\\d+)$")
	public void i_will_have_to_pay_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(true)
		{
			System.out.println("I paid 10 gbp - raja added glue");
		}
		else
		{
	    throw new PendingException();
		}
	}
}
